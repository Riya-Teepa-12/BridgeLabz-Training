import java.util.*;
public class VowelConsonants{
   public static int[] countVowelConsonant(String s){
   int arr[]=new int[2];
     int count=0;
	 int sount=0;
     for(int i=0;i<s.length();i++){
     if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='0'||s.charAt(i)=='u'){
	   count++;
	   }
	   else{ 
	   if(s.charAt(i)>=97 && s.charAt(i)<=122 ||s.charAt(i)>=65 && s.charAt(i)<=90)
		   sount++;
	   }
	 }
	 arr[0]=count;//vowel
	 arr[1]=sount;//consonant
	return arr;
   }
   public static void main(String []args){
      Scanner input = new Scanner(System.in);
	  
	  //taking string as input from the user
	  String s=input.next();
	  
	  //displaying the result
	  int []arr=countVowelConsonant(s);
	  System.out.println("The number of Vowels is "+arr[0]);
	  System.out.println("The number of Consonants is "+arr[1]);
	  
	  input.close();
	  
   }
 }