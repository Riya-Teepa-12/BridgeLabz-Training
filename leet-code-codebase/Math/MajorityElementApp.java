import java.util.Scanner;

class MajorityElementApp {

    // Method to find the majority element using Boyer-Moore Voting Algorithm
    public int majorityElement(int[] nums) {

        int count = 0;      // Counter to track frequency balance
        int candidate = 0;  // Possible majority element

        for (int num : nums) {

            // When count becomes zero, choose a new candidate
            if (count == 0) {
                candidate = num;
            }

            // Increase count if same as candidate, else decrease
            count += (num == candidate) ? 1 : -1;
        }

        // The candidate will be the majority element
        return candidate;
    }

    // Main method to take input from user
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create object of class
        MajorityElementApp obj = new MajorityElementApp();

        // Call method and display result
        int result = obj.majorityElement(nums);
        System.out.println("Majority Element: " + result);

        sc.close();
    }
}
