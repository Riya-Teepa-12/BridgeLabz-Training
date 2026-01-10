import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TargetArrayCreator {

    // Method to create target array using nums and index
    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> list = new ArrayList<>();

        // Insert elements at given index positions
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        // Convert list to array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] index = new int[n];

        // Input nums array
        System.out.println("Enter nums array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input index array
        System.out.println("Enter index array elements:");
        for (int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }

        TargetArrayCreator obj = new TargetArrayCreator();
        int[] output = obj.createTargetArray(nums, index);

        // Print result
        System.out.print("Target Array: ");
        for (int val : output) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
