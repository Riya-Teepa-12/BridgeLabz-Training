import java.util.*;

public class ShortestSubarrayDegree {

    // Method to find the shortest subarray with same degree
    public static int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

     
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int maxDegree = 0;
        for (int freq : map.values()) {
            maxDegree = Math.max(maxDegree, freq);
        }

      
        List<Integer> degreeElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxDegree) {
                degreeElements.add(entry.getKey());
            }
        }

     
        int minLength = Integer.MAX_VALUE;

        for (int num : degreeElements) {
            int firstIndex = 0;
            int lastIndex = nums.length - 1;

          
            while (firstIndex <= lastIndex) {
                if (nums[firstIndex] != num) {
                    firstIndex++;
                } else if (nums[lastIndex] != num) {
                    lastIndex--;
                } else {
                    minLength = Math.min(minLength, lastIndex - firstIndex + 1);
                    break;
                }
            }
        }

        return minLength;
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Call method and print result
        int result = findShortestSubArray(nums);
        System.out.println("Length of shortest subarray with same degree: " + result);

        input.close();
    }
}
