import java.util.Scanner;

class SumOfUniqueElements {
      //L-1748
    // Method to calculate sum of unique elements
    public static int sumOfUnique(int[] nums) {
        int freq[] = new int[101]; // Frequency array (0–100)

        // Count frequency of each number
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int sum = 0;

        // Add numbers that appear exactly once
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Take array elements input
        System.out.println("Enter elements (0 to 100):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call method and print result
        int result = sumOfUnique(nums);
        System.out.println("Sum of unique elements: " + result);

        sc.close();
    }
}
