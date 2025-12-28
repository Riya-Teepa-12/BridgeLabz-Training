import java.util.*;

public class MaxConsecutiveOnes{

    // Method to find maximum consecutive ones
    public int findMaxConsecutiveOnes(int[] nums) {
        int coutn = 0;   
        int max = 0;    

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

        
            if (nums[i] == 1) {
                coutn++;
            } 
        
            else {
                coutn = 0;
            }

           
            max = Math.max(max, coutn);
        }
        return max;
    }

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           MaxConsecutiveOnes obj = new MaxConsecutiveOnes();

        // Input array size
        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        int[] nums = new int[n];

        // Input array elements (0 or 1)
        System.out.println("Enter array elements (0 or 1):");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Call method and print result
        int result = obj.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1s: " + result);

        input.close();
    }
}
