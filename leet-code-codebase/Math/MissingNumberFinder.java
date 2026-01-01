import java.util.HashSet;
import java.util.Set;

public class MissingNumberFinder {

    // Method to find the missing number in the array
    public static int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // Store all elements of the array in a set
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int value = 0;

        // Check which number from 1 to n is missing
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i + 1)) {
                value = i + 1;
                break;
            }
        }
        return value;
    }

    // Main method to test the program
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5};

        int result = missingNumber(nums);
        System.out.println("Missing number is: " + result);
    }
}
