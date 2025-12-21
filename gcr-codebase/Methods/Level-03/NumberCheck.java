import java.util.*;
class NumberCheck{

   //count of digits in the number
   public static int countOfDigits(int number){
   int count=0;
       while(number!=0){
	   number=number/10;
	   count++;
	   }
	   return count;
   }
   
   //method to store digit of the number
   public static int[] digitArray(int number){
      int count=countOfDigits(number);
	  int arr[]=new int[count];
	  int index=count-1;
	  for(int i=0;i<count;i++){
	    arr[index--] = number%10;
		number=number/10;
	  }
	  return arr;
   }
   
   //method to check number is duck or not
   public static boolean isDuckNumber(int []digits){
	 for(int i=1;i<digits.length;i++){
	     if(digits[i]!=0)
		 {
		   return true;
		 }
	 }
	 return false;
   }
   
   //tallest height of the players
   public static boolean isArmstrong(int number, int[] digits){
     int sum=0;
	 for(int i=1;i<digits.length;i++){
	   int jump=1;
	    for(int j=0;j<digits.length;j++)
		  jump*=digits[i];
		  sum+=jump;
	 }
	 return sum==number;
   }



   //largest and second largest number
     public static  void largestAndSecondLargest(int []digits){
	   int largestNumber=Integer.MIN_VALUE;
	   int secondLargestNumber=Integer.MIN_VALUE;
	   for(int i=0;i<digits.length;i++){
	      if(digits[i]>largestNumber){
		    secondLargestNumber =largestNumber;
			largestNumber = digits[i];
	   }
	   else if(digits[i]>secondLargestNumber && digits[i]<largestNumber){
	   secondLargestNumber = digits[i];
	   }
	 }
	 System.out.println("Largest Digit"+largestNumber);
	  System.out.println("SEcondLargest Digit"+secondLargestNumber);
 }
 
  // smallest and secondsmallest number
     public static  void smallestAndSecondSmallest(int []digits){
	   int smallestNumber=Integer.MAX_VALUE;
	   int secondSmallestNumber=Integer.MAX_VALUE;
	   for(int i=0;i<digits.length;i++){
	      if(digits[i]<smallestNumber){
		    secondSmallestNumber =smallestNumber;
			smallestNumber = digits[i];
	   }
	   else if(digits[i]<secondSmallestNumber && digits[i]>smallestNumber){
	   secondSmallestNumber = digits[i];
	   }
	 }
	 System.out.println("Smallest Digit"+smallestNumber);
	  System.out.println("SecondSmallest Digit"+secondSmallestNumber);
 }
   public static void main(String []args){
    Scanner input=new Scanner(System.in);
	
	//input from user
	System.out.println("Enter a number:");
	int number = input.nextInt();
	
	int []digits=digitArray(number);
	System.out.println("Count of the digits"+digits.length);
    
	
	 if(isDuckNumber(digits))
	 {
	 System.out.println(number+" is a duck number");
	 }
	 else{
	 System.out.println(number+" is not a duck number");
	 }
	  if(isArmstrong(number,digits))
	 {
	 System.out.println(number+" is a armstrong number");
	 }
	 else{
	 System.out.println(number+" is not a armstrong number");
	 }
	 largestAndSecondLargest(digits);
	 smallestAndSecondSmallest(digits);
	 
	input.close();


	
}
}