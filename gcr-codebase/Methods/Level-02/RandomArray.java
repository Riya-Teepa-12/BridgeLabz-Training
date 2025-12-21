import java.util.*;

class RandomArray{

    //declaring a method to generate 4Digit RandomNumber
	 public int[] generate4DigitRandomArray(int size){
	     int []arr = new int[size];
		 for(int i=0;i<size;i++){
		  arr[i]= (int)(Math.random()*9000)+1000;
		 }
		 return arr;
	 }
	 
	//declaring a method to find average , min and max
     public double[] findAverageMinMax(int[] numbers){
	     double arr[] = new double[3];
		 double average=0;
		 int min=Integer.MAX_VALUE;
		 int max=Integer.MIN_VALUE;
		 for(int i=0;i<numbers.length;i++){
		  average+=numbers[i];
		  min=Math.min(min,numbers[i]);
		  max=Math.max(max,numbers[i]);
		 }
		 arr[0] = average/ numbers.length;
		 arr[1] =min;
		 arr[2] =max;
		 return arr;
		
	 }
   
  public static void main(String []args){
   //creating object of scanner class for taking input from the user
    Scanner input= new Scanner(System.in);
	
	//calling the methods
      RandomArray out = new  RandomArray();
	   int ans[] = out.generate4DigitRandomArray(5);
	    System.out.println("The numbers are :");  
	   for(int i=0;i<ans.length;i++)
		 System.out.println(ans[i]); 

	 
	   double result[] = out.findAverageMinMax(ans);
	
	//displaying the result
	
	System.out.println("The average of numbers is"+result[0]);
	System.out.println("The minimum number is"+result[1]);
	System.out.println("The maximum number is"+result[2]);
	
	

	input.close();
	
	
   }
}