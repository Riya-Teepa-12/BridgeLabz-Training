import java.util.*;

public class FindMaximumNumber{

	//taking input from user
	public static int []takeInput(){
		
		//taking input
		Scanner input=new Scanner(System.in);
		int []num=new int[3];
		System.out.println("Enter 3 numbers");
		num[0]= input.nextInt();
		num[1]= input.nextInt();
		num[2]= input.nextInt();
		
		return num;
	}
	
	// method to find the maximum of three number
	public static int findMaximumNumber(int []arr){
		
		int max=Math.max(arr[0],Math.max(arr[1],arr[2]));
		
		return max;
	}
	
	//displaying maximum number
	public static void displayOutput(int n){	
		System.out.println("Maximum number is "+n);
	}

	public static void main(String[]args){
	
	// calling method
	
	int []arr=takeInput();
	int number=findMaximumNumber(arr);
	 displayOutput(number);
	}
	
}