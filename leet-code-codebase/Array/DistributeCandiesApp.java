import java.util.Scanner;


//L-575
// Class to calculate maximum number of candy types sister can get
class DistributeCandiesApp {

    // Method to distribute candies
    public int distributeCandies(int[] candyType) {

        // Boolean array to track seen candy types
        boolean[] seen = new boolean[200001];
        int offset = 100000; // To handle negative candy types
        int uniqueTypes = 0;
        int limit = candyType.length / 2; // Sister can eat only half

        // Traverse candy array
        for (int candy : candyType) {
            int idx = candy + offset;

            // If candy type not seen before
            if (!seen[idx]) {
                seen[idx] = true;
                uniqueTypes++;

                // Stop if sister reached her limit
                if (uniqueTypes == limit)
                    break;
            }
        }
        return uniqueTypes;
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of candies: ");
        int n = sc.nextInt();

        int[] candyType = new int[n];

        // Input candy types
        System.out.println("Enter candy types:");
        for (int i = 0; i < n; i++) {
            candyType[i] = sc.nextInt();
        }

        // Create object
        DistributeCandiesApp obj = new DistributeCandiesApp();

        // Call method and print result
        int result = obj.distributeCandies(candyType);
        System.out.println("Maximum candy types sister can eat: " + result);

        sc.close();
    }
}
