import java.util.*;

class Solution{
    public boolean isMonotonic(int[] nums) {
        boolean flag = true;   // non-decreasing
        boolean flag1 = true;  // non-increasing

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                flag = false;
            }
            if (nums[i] < nums[i + 1]) {
                flag1 = false;
            }
        }
        return flag || flag1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        Solution obj = new Solution();
        boolean result = obj.isMonotonic(nums);

        if (result) {
            System.out.println("Array is monotonic");
        } else {
            System.out.println("Array is not monotonic");
        }

        input.close();
    }
}
