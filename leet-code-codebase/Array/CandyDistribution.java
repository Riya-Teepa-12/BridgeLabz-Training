import java.util.*;

class CandyDistribution {

    // Method to find maximum unique candy types
    public int distributeCandies(int[] candyType) {

        // Boolean array to track seen candy types
        boolean[] seen = new boolean[200001];

        int offset = 100000;                  
        int uniqueTypes = 0;                  
        int limit = candyType.length / 2;     

        // Traverse candy types
        for (int candy : candyType) {
            int idx = candy + offset;

            // If candy type not seen before
            if (!seen[idx]) {
                seen[idx] = true;
                uniqueTypes++;

                // Stop if limit reached
                if (uniqueTypes == limit)
                    break;
            }
        }
        return uniqueTypes;
    }

    // Main method to take input and display output
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          CandyDistribution obj = new CandyDistribution();

        // Input size of candy array
        System.out.print("Enter number of candies: ");
        int n = input.nextInt();

        int[] candyType = new int[n];

     
        System.out.println("Enter candy types:");
        for (int i = 0; i < n; i++) {
            candyType[i] = input.nextInt();
        }

        // Call method and print result
        int result = obj.distributeCandies(candyType);
        System.out.println("Maximum unique candies sister can get: " + result);

        input.close();
    }
}
