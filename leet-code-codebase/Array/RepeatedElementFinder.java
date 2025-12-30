import java.util.*;

public class RepeatedElementFinder {

    // Method to find the element repeated n times
    public static int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;              // n value
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) == n) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     
        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] nums = new int[size];

        // Take array elements input
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = input.nextInt();
        }

        // Call method and display result
        int result = repeatedNTimes(nums);
        System.out.println("Element repeated n times: " + result);

        input.close();
    }
}
