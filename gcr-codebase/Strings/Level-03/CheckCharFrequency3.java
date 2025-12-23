import java.util.Scanner;

public class CheckCharFrequency3{

    //  frequency using nested loops
    public static String[] findFrequency(String txt){

        char[] chars=txt.toCharArray();
        int[] fq=new int[chars.length];
        for(int i=0;i<chars.length;i++){
            fq[i]=1;
        }
		
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='0')
                continue;

            for(int j=i+1;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    fq[i]++;
                    chars[j]='0';
                }
            }
        }
        int count=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]!='0')
                count++;
        }
        String[] res=new String[count];
        int index=0;

        for(int i=0;i<chars.length;i++){
            if(chars[i]!='0'){
                res[index]=chars[i]+" : "+fq[i];
                index++;
            }
        }

        return res;
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string:");
        String text=input.nextLine();

        String[] f=findFrequency(text);

        System.out.println("\nCharacter Frequency:");
        System.out.println("--------------------");

        for(int i=0;i<f.length;i++){
            System.out.println(f[i]);
        }

        input.close();
    }
}
