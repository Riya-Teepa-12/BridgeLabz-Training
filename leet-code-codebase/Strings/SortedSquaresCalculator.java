import java.util.Arrays;
import java.util.Scanner;

public class SortedSquaresCalculator {

    // Method to return squares of array elements in sorted order
    public int[] sortedSquares(int[] nums) {

        // Convert all negative numbers to positive
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
            }
        }

        // Sort the array
        Arrays.sort(nums);

        // Square each element
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        return nums;
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        SortedSquaresCalculator obj = new SortedSquaresCalculator();
        int[] result = obj.sortedSquares(nums);

        System.out.println("Sorted squares array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
