import java.util.Scanner;

public class CheckCharFrequency2{

    // unique characters 
    public static char[] uniqueCharacters(String txt){

        int len=txt.length();
        char[] temp=new char[len];
        int count=0;

        for(int i=0;i<len;i++){
            char current=txt.charAt(i);
            boolean isUnique=true;

            for(int j=0;j<i;j++){
                if(current==txt.charAt(j)){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                temp[count++]=current;
            }
        }
        char[] unique=new char[count];
        for(int i=0;i<count;i++){
            unique[i]=temp[i];
        }
        return unique;
    }

    // method to check frequency using ASCII values 
    public static String[][] findFrequency(String txt){

        int[] freq=new int[256];
        for(int i=0;i<txt.length();i++){
            char ch=txt.charAt(i);
            freq[ch]++;
        }
        char[] arr=uniqueCharacters(txt);
        String[][] res=new String[arr.length][2];

        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            res[i][0]=String.valueOf(ch);
            res[i][1]=String.valueOf(freq[ch]);
        }

        return res;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
   
       //Taking input from the user
        System.out.println("Enter the string:");
        String txt=input.nextLine();

        String[][] brr=findFrequency(txt);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------------------");

        for(int i=0;i<brr.length;i++){
            System.out.println(brr[i][0]+"\t\t"+brr[i][1]);
        }

        input.close();
    }
}
