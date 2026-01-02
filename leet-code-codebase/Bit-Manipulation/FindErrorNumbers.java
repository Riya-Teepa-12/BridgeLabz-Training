import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindErrorNumbers {

    // Method to find the duplicate and missing numbers
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2]; 

        // Identify the duplicate number
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                result[0] = nums[i];
            }
        }

        // Identify the missing number
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i + 1)) {
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }

    // Main method to take input from the user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking array size as input
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();

        int[] nums = new int[n];

        // Taking array elements as input
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Creating object of the class
        FindErrorNumbers obj = new FindErrorNumbers();

        // Calling method
        int[] result = obj.findErrorNums(nums);

        // Displaying output
        System.out.println("Duplicate Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);

        input.close();
    }
}
