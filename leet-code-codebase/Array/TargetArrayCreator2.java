import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TargetArrayCreator {
     //L-1389
    // Method to create target array using nums and index arrays
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        // Insert nums[i] at position index[i]
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        // Convert ArrayList to array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] index = new int[n];

        // Input nums array
        System.out.println("Enter elements of nums array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input index array
        System.out.println("Enter elements of index array:");
        for (int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }

        // Create target array
        int[] target = createTargetArray(nums, index);

        // Print result
        System.out.println("Target Array:");
        for (int value : target) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
