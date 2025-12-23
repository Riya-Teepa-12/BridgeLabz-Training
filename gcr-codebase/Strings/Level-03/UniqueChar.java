import java.util.Scanner;

public class UniqueChar{

    // length of string
    public static int findLength(String str){
        int count=0;
        while(true){
            try{
                str.charAt(count);
                count++;
            }catch(Exception e){
                break;
            }
        }
        return count;
    }

    // unique characters using charAt()
    public static char[] findUniqueCharacter(String text){

        int len=findLength(text);
        char[] temp=new char[len];
        int c=0;

        for(int i=0;i<len;i++){
            char current=text.charAt(i);
            boolean isUnique=true;
            for(int j=0;j<i;j++){
                if(current==text.charAt(j)){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                temp[c++]=current;
            }
        }
        char[] result=new char[c];
        for(int i=0;i<c;i++){
            result[i]=temp[i];
        }

        return result;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String text=input.nextLine();

        char[] arr=findUniqueCharacter(text);

        System.out.println("Unique Characters:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        input.close();
    }
}
