import java.util.Scanner;

class SumOfWordValues {

    // Method to check if firstWord + secondWord == targetWord
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        int sum = 0; // value of firstWord
        int num = 0; // value of secondWord
        int jum = 0; // value of targetWord

        // Convert firstWord to number
        for (int i = 0; i < firstWord.length(); i++)
            sum = sum * 10 + (firstWord.charAt(i) - 'a');

        // Convert secondWord to number
        for (int i = 0; i < secondWord.length(); i++)
            num = num * 10 + (secondWord.charAt(i) - 'a');

        // Convert targetWord to number
        for (int i = 0; i < targetWord.length(); i++)
            jum = jum * 10 + (targetWord.charAt(i) - 'a');

        // Check if sum matches
        return jum == sum + num;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first word: ");
        String firstWord = sc.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = sc.nextLine();

        System.out.print("Enter target word: ");
        String targetWord = sc.nextLine();

        SumOfWordValues obj = new SumOfWordValues();
        boolean result = obj.isSumEqual(firstWord, secondWord, targetWord);

        // Print result
        System.out.println("Is sum equal? " + result);

        sc.close();
    }
}
