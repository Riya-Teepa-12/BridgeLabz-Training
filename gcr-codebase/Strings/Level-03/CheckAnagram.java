import java.util.Scanner;

public class CheckAnagram{

    //checking  two string are anagrams
    public static boolean isAnagram(String t1,String t2){

        if(t1.length()!=t2.length())
            return false;
        int[] freq1=new int[256];
        int[] freq2=new int[256];

        for(int i=0;i<t1.length();i++){
            char ch=t1.charAt(i);
            freq1[ch]++;
        }

        for(int i=0;i<t2.length();i++){
            char ch=t2.charAt(i);
            freq2[ch]++;
        }
        for(int i=0;i<256;i++){
            if(freq1[i]!=freq2[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter first text:");
        String t1=input.nextLine();

        System.out.println("Enter second text:");
        String t2=input.nextLine();

        boolean res=isAnagram(t1,t2);

        if(res)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

        input.close();
    }
}
