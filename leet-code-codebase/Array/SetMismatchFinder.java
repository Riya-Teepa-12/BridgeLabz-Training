import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetMismatchFinder {

    // Method to find duplicate and missing numbers
    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2]; // result[0] = duplicate, result[1] = missing

        // Find the duplicate number
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                result[0] = nums[i];
            }
        }

        // Find the missing number
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i + 1)) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take array size
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        int[] nums = new int[n];

      
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        
        int[] answer = findErrorNums(nums);

        // Print result
        System.out.println("Duplicate number: " + answer[0]);
        System.out.println("Missing number: " + answer[1]);

        input.close();
    }
}
