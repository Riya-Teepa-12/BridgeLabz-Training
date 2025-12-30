import java.util.Scanner;

class MajorityElementFinder{

    // Method to find the majority element using Boyer-Moore Voting Algorithm
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Traverse the array
        for (int num : nums) {
            // If count is 0, select new candidate
            if (count == 0) {
                candidate = num;
            }

            // Increase or decrease count
            count += (num == candidate) ? 1 : -1;
        }

        // Candidate will be the majority element
        return candidate;
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take size of array
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] nums = new int[n];

        // Take array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Call  method
      
        int result = majorityElement(nums);

        // Print result
        System.out.println("Majority Element is: " + result);

        input.close();
    }
}
