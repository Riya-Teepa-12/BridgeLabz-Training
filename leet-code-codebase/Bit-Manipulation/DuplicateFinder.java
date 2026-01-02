import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateFinder {

    // Method to find the duplicate number in the array
    public int findDuplicate(int[] nums) {
        int value = 0;
        Set<Integer> set = new HashSet<>();
        
        // Add all numbers to the set
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // Check for the first duplicate
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                value = nums[i]; // Duplicate found
                break;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take array size input
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] nums = new int[n];
        
        // Take array elements input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        
        // Create object and call method
        DuplicateFinder df = new DuplicateFinder();
        int duplicate = df.findDuplicate(nums);
        System.out.println("The duplicate number is: " + duplicate);
        
        input.close();
    }
}
