import java.util.Scanner;

public class RemoveElementFromArray {

    // Method to remove all occurrences of val from nums array -27
    public static int removeElement(int[] nums, int val) {
        int i = 0; 
   
    
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j]; 
                i++;              
            }
        }
        return i; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        int[] nums = new int[n];

        // Taking array elements from user
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Taking the value to remove
        System.out.print("Enter value to remove: ");
        int val = input.nextInt();

        // Calling removeElement method
        int newLength = removeElement(nums, val);

        // Printing results
        System.out.println("New length after removal: " + newLength);
        System.out.print("Array after removal: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        input.close();
    }
}
