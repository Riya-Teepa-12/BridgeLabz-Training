import java.util.*;

public class ArrayIndexOutOfBoundExceptionDemo{

   // method to generate array Index out of bounce exception
   public static void generateException(int arr[]){
      int length = arr.length;
	  int x=arr[length];
   }
   
   //handling arrayIndexOutOfBoundsException
   public static void handlingException(int arr[]){
     try{
	     int length=arr.length;
		 int x=arr[length];
	  }catch(ArrayIndexOutOfBoundsException ex){
	    System.out.println("ArrayIndexOutOfBoundException error:");
		 System.out.println("Error Message:"+ex.getMessage());
	  }
   }
   
   public static void main(String []args){
      //taking input from the user
	  Scanner input = new Scanner(System.in);
	  int []arr = new int[3];
	  for(int i=0;i<3;i++){
	  arr[i]=input.nextInt();
	  }
	  
	  //calling method
	  System.out.println("Generating ArrayIndexOutOfBoundException:");
	  try{
	    generateException(arr);
	  }catch(ArrayIndexOutOfBoundsException ex){
	     handlingException(arr);
	  }
	  input.close();
   }
}