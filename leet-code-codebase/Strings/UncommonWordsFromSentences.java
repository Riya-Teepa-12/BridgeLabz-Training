import java.util.*;

public class UncommonWordsFromSentences {

    // Method to find uncommon words from two sentences
    public static String[] uncommonFromSentences(String s1, String s2) {

        // Split sentences into words
        String[] str = s1.split(" ");
        String[] std = s2.split(" ");

        // List to store all words
        List<String> list = new ArrayList<>();

        // Add words of first sentence
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }

        // Add words of second sentence
        for (int i = 0; i < std.length; i++) {
            list.add(std[i]);
        }

        // Map to count frequency of each word
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }

     
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                resultList.add(e.getKey());
            }
        }


        String[] result = new String[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input sentences
        System.out.println("Enter first sentence:");
        String s1 = input.nextLine();

        System.out.println("Enter second sentence:");
        String s2 = input.nextLine();

        // Call method
        String[] uncommonWords = uncommonFromSentences(s1, s2);

        // Print output
        System.out.println("Uncommon words are:");
        for (String word : uncommonWords) {
            System.out.println(word);
        }

        input.close();
    }
}
