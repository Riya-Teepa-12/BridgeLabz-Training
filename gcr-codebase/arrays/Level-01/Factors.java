import java.util.*;
public class Factors{
   public static void main(String []args){
	Scanner input= new Scanner(System.in);
	//Taking integer as input and calculating its factor

	System.out.println("Enter a number: ");
	int number=input.nextInt();
	int maxFactor=10;
	int []factors=new int[maxFactor];
	int index=0;

	//Calculating Factors
	for(int i=1;i<=number;i++){
	   if(maxFactor==index){
	      int []temparray=new int[maxFactor];

	      //copying factors array in temparray
	      for(int j=0;j<maxFactor;j++){
		  temparray[j]=factors[j];
	      }
	
	      //double the maxfoctor size
	      maxFactor=maxFactor*2;
	      factors=new int[maxFactor];

	      //Again copying temparray in factors array
	      for(int j=0;j<index;j++){
		  factors[j]=temparray[j];
	      }

	   }
	   if(number%i==0){
	      factors[index]=i;
	      index++;
	   }
	}
	//Printing the factors
	for(int i=0;i<maxFactor;i++){
	    if(factors[i]!=0)
	    System.out.print(factors[i]+" ");
	}

	input.close();
   }
}