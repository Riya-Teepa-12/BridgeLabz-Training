import java.util.Scanner;

class CapitalizeTitleApp {

    // Method to capitalize the title based on given rules
    public String capitalizeTitle(String title) {

        // Split the sentence into words
        String[] arr = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {

            // If word length is less than 3, convert to lowercase
            if (arr[i].length() < 3) {
                sb.append(arr[i].toLowerCase());
            } 
            // Otherwise capitalize first letter and lowercase the rest
            else {
                sb.append(Character.toUpperCase(arr[i].charAt(0)))
                  .append(arr[i].substring(1).toLowerCase());
            }

            // Add space between words
            if (i != arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // Main method to take input from user
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter the title:");
        String title = sc.nextLine();

        // Create object of class
        CapitalizeTitleApp obj = new CapitalizeTitleApp();

        // Call method and print result
        String result = obj.capitalizeTitle(title);
        System.out.println("Capitalized Title:");
        System.out.println(result);

        sc.close();
    }
}
