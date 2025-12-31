import java.util.*;

public class CreateTargetArrayApp {

    // Method to create target array using index positions
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        // Insert elements at given index
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        // Convert list to array
        int[] finale = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            finale[i] = list.get(i);
        }

        return finale;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] index = new int[n];

        // Input nums array
        System.out.println("Enter nums array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input index array
        System.out.println("Enter index array:");
        for (int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }

        // Call method
        int[] result = createTargetArray(nums, index);

        // Print result
        System.out.println("Target Array:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
