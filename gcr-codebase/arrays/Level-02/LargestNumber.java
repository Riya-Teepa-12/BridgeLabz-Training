import java.util.*;
public class LargestNumber{
   public static void main(String []args){
	Scanner input= new Scanner(System.in);
	//Taking integer as input and calculating its first largest and second largest
        System.out.println("Enter the number :");
	int number=input.nextInt();
	int maxDigit=10;
	int []array=new int[maxDigit];
	int index=0;

	while(number>0){
	   array[index]=number%10;
	   number/=10;
	   index++;
	   
	   if(index==maxDigit)
	      break;
	}

	int largest=0;
	int secondLargest=0;
	
	//Finding Largest Number
	for(int i=0;i<maxDigit;i++){
	    if(array[i]>largest)
		largest=array[i];
	}

	//Finding Second Largest
	for(int i=0;i<maxDigit;i++){
	    if(array[i]>secondLargest && array[i]!=largest)
		secondLargest=array[i];
	}

	System.out.println("Largest: "+largest);
	System.out.println("Second Largest: "+secondLargest);

	input.close();

   }
}




