import java.util.*;
class FirstOccurenceString{

    public int strStr(String haystack, String needle) {
        int index = -1;
        index = haystack.indexOf(needle);
        return index;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string1 = input.next();
        String string2 = input.next();
         FirstOccurenceString sol = new FirstOccurenceString();

        System.out.println(sol.strStr(string1, string2)); 
    }
}
