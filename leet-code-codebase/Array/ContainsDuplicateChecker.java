import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicateChecker {

    // Checks if the array contains any duplicate element
    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates
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

        // Method call
        boolean result = containsDuplicate(nums);

        // Output result
        System.out.println("Contains duplicate: " + result);

        input.close();
    }
}
