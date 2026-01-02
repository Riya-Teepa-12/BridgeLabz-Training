import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumberFinder{

    // Method to find the element that appears only once
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the number that occurs only once
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1; 
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        SingleNumberFinder finder = new SingleNumberFinder();
        int result = finder.singleNumber(nums);

        System.out.println("The single number is: " + result);

        input.close();
    }
}
