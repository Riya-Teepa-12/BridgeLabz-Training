import java.util.*;
 class FindFactor{
    //declaring a static method to find the factors
	 public static int[] findFactor(int number){
	 int count=0;
	      for(int i=1;i<=number;i++){
		     if(number % i==0){
			   count++;
			 }
		  }
		  int arr[] = new int[count];
		  int j=0;
		  for(int i=1;i<=number;i++){
		     if(number % i==0){
			   arr[j++]=i;
			 }
		  }
		 return arr;
	  }
	  
	  //declaring a method to find the sum of the factors using factors array
	  public static double sumOfTheFactors(int ans[]){
		  int sum=0;
		  for(int i=0;i<ans.length;i++){
		    sum+=ans[i];
		  }
		return sum;
		  
	  }
	  //declaring a method to find the product of the factors using factors array
	    public static double productOfTheFactors(int ans[]){
		  int product=1;
		  for(int i=0;i<ans.length;i++){
		    product*=ans[i];
		  }
		return product;
		  
	  }
	  
	  //declaring a method to find the sum of square of the factors using Math.pow() method
       public static double sumOfSquareOfFactors(int ans[]){
	    
		  int sum=0;
		  for(int i=0;i<ans.length;i++){
		    sum+=Math.pow(ans[i],2);
		  }
		return sum;
		  
	  }
	  
	    
    public static void main(String []args){
	 //creating scanner object for taking input from user
      Scanner input = new Scanner(System.in);
	  
	  
	  //taking integer as input from the user
	    System.out.println("Enter the number : ");
	    int number = input.nextInt();
	 //calling the methods
	 
	   int ans[]=findFactor(number);
	    
	   double ans1=sumOfTheFactors(ans);
	   double ans2=productOfTheFactors(ans);
	   double ans3=sumOfSquareOfFactors(ans);
	    
		System.out.print("Factors of the number is :");
		for(int i=0;i<ans.length;i++){
		  System.out.print( ans[i]+",");
		}
                System.out.println();
		System.out.print("Sum of the factors of the number is :" +ans1);
                System.out.println();
		System.out.print("product of the factors of the number is :" +ans2);
                System.out.println();
		System.out.print("sum of the square of the factors of the number is :" +ans3);
	     input.close();

  }	

 }