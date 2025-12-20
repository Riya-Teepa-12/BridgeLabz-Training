import java.util.*;
class FindDegree{
	//creating method to various trigonometric functions
     public double[] calculateTrigonometricFunctions(double angle){
	        double arr[]=new double[3];
			 double radian= (Math.PI /180) * angle;
			arr[0] =Math.sin(radian);
            arr[1]=Math.cos(radian);
            arr[2]=Math.tan(radian);			
		return arr;
	 }


	 
   
   public static void main(String []args){
	   //creating scanner object to take input from user
      Scanner input =new Scanner(System.in);
	  
	  //taking integer as input from the user for the angle in degree
	   System.out.println("Enter the Angle in degree");
       double angle= input.nextDouble();
	  
	    //calling the method
		   FindDegree obj = new  FindDegree();
		   double ans[]=new double[3];
	         ans = obj.calculateTrigonometricFunctions(angle);
	  
	    //displaying the result
	      System.out.println("Sine :"+ans[0]);
		   System.out.println("Cosine :"+ans[1]);
		    System.out.println("Tangent :"+ans[2]);
		  
	   input.close();
	   
     }
 }