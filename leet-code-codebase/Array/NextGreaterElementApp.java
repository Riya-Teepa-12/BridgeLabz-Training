import java.util.*;

//L-496

public class NextGreaterElementApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of nums2
        System.out.print("Enter size of nums2: ");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];

        // Read elements of nums2
        System.out.println("Enter elements of nums2:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        // Read size of nums1
        System.out.print("Enter size of nums1: ");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];

        // Read elements of nums1
        System.out.println("Enter elements of nums1:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        // Find next greater elements
        int[] result = findNextGreater(nums1, nums2);

        // Print result
        System.out.println("Next Greater Elements:");
        for (int val : result) {
            System.out.print(val + " ");
        }

        sc.close();
    }

    // Method to find next greater element using stack
    public static int[] findNextGreater(int[] nums1, int[] nums2) {

        // Map to store next greater element for nums2 values
        HashMap<Integer, Integer> map = new HashMap<>();

        // Stack to keep decreasing order elements
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Remaining elements have no greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Build answer for nums1
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
