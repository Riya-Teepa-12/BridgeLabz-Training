import java.util.Scanner;

public class MoveZeroesInArray {

    // Moves all zeroes to the end while maintaining order of non-zero elements
    public static void moveZeroes(int[] nums) {
        int j = 0; // Position for next non-zero element

        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Call moveZeroes method
        moveZeroes(nums);

        // Print updated array
        System.out.println("Array after moving zeroes:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
