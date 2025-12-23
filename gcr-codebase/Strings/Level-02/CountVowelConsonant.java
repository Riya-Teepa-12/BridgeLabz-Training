import java.util.Scanner;

public class CountVowelConsonant{

    // Method to check character type
    public static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z'){
            ch =(char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
              if(ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find vowels and consonants in string
    public static int[] findVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;
        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                String result = checkChar(ch);
                if (result.equals("Vowel")) {
                    vowels++;
                } else if (result.equals("Consonant")) {
                    consonants++;
                }
             } catch (Exception e) {
                break; 
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Call method
        int[] count = findVowelsAndConsonants(str);

        // Display result
        System.out.println("Vowels Count     : " + count[0]);
        System.out.println("Consonants Count : " + count[1]);

        input.close();
    }
}
