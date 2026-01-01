import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RelativeSortArrayCalculator {

    // Method to sort arr1 according to the order of arr2
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        List<Integer> orderedList = new ArrayList<>();
        List<Integer> remainingList = new ArrayList<>();

        // Add elements of arr1 that appear in arr2 (in arr2 order)
        for (int i = 0; i < arr2.length; i++) {
            int value = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if (value == arr1[j]) {
                    orderedList.add(value);
                }
            }
        }

        // Add elements of arr1 that are not in arr2
        for (int i = 0; i < arr1.length; i++) {
            if (!orderedList.contains(arr1[i])) {
                remainingList.add(arr1[i]);
            }
        }

        // Sort remaining elements
        Collections.sort(remainingList);

        // Combine both lists
        orderedList.addAll(remainingList);

        // Convert list to array
        int[] result = new int[orderedList.size()];
        int index = 0;
        for (int num : orderedList) {
            result[index++] = num;
        }

        return result;
    }

    // Main method to take input from user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        RelativeSortArrayCalculator obj = new RelativeSortArrayCalculator();
        int[] result = obj.relativeSortArray(arr1, arr2);

        System.out.println("Relative sorted array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
