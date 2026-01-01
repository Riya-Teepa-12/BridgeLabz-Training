import java.util.Scanner;

public class CountElementsCalculator {

    // Method to count elements strictly between min and max
    public int countElements(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find minimum and maximum values in the array
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int count = 0;

        // Count elements greater than min and less than max
        for (int num : nums) {
            if (num > min && num < max) {
                count++;
            }
        }

        return count;
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

        CountElementsCalculator obj = new CountElementsCalculator();
        int result = obj.countElements(nums);

        System.out.println("Count of elements between min and max: " + result);

        input.close();
    }
}
