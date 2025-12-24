import java.util.*;

public class CompareTwoStrings{

    //method to count the substring occurence in string
    public static int compareTwoStrings(String s1, String s2) {
        int minimumLength = Math.min(s1.length(),s2.length());
		for(int i=0;i<minimumLength;i++){
		if(s1.charAt(i)!=s2.charAt(i))
			if(s1.charAt(i)>s2.charAt(i))
		  return -1;
	     else if(s2.charAt(i)>s1.charAt(i))
		  return 1;
		}
	   return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       //taking input from the user
        System.out.print("Enter the string1: ");
        String str1 = input.nextLine();

        System.out.print("Enter the string2: ");
        String str2 = input.nextLine();

      //calling the method and displaying the result 
        int res = compareTwoStrings(str1, str2);
        
		if(res>0){
		  System.out.println("The " +str1+ " is comes before "+str2+" lexicographically");
		}
		else if(res<0){
		  System.out.println("The " +str2+ " is comes before "+str1+" lexicographically");
		}
		else{
		 System.out.println("Both strings are same");
		}
        input.close();
    }
}
