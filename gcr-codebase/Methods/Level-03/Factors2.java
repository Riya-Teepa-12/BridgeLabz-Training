import java.util.*;
public class Factors2{

   //Calculating the factors of the number  
   public static int[] factors(int number){

	int []factors=new int[10];
	int maxFactor=10;
	int index=0;
	int count=0;

	for(int i=1;i<=number;i++){
	   if(maxFactor==index){
	      int []temparray=new int[maxFactor];

	     	      for(int j=0;j<maxFactor;j++){
		  temparray[j]=factors[j];
	      }
	
	     	      maxFactor=maxFactor*2;
	      factors=new int[maxFactor];

	     	      for(int j=0;j<index;j++){
		  factors[j]=temparray[j];
	      }

	   }
	   if(number%i==0){
	      factors[index]=i;
	      index++;
	   }
	}

	for(int i=1;i<=number;i++){
	   if(number%i==0)
	      count++;
	   }

	return factors;
   }

   //Calculating the greatest Factor
   public static int greatest(int []factors){
	int max=0;
	for(int i=0;i<factors.length;i++){
	    if(max<factors[i])
	       max=factors[i];
	}
	
	return max;
   }



   //Calculating the sum of Factors
   public static int sum(int []factors){
	int sum=0;
	for(int i=0;i<factors.length;i++){
	    sum+=factors[i];
	}
	
	return sum;
   }

   //Calculating the Products of Factors
   public static int product(int []factors){
	int product=1;
	for(int i=0;i<factors.length;i++){
           if(factors[i]!=0)
	    product*=factors[i];
	}
	
	return product;
   }

   //Calculating the Products of cube of Factors
   public static int productOfCube(int []factors){
	int product=1;
	for(int i=0;i<factors.length;i++){
	   if(factors[i]!=0)
	    product*=Math.pow(factors[i],3);
	}
	
	return product;
   }

   public static void main(String []args){
	Scanner input= new Scanner(System.in);
	//Taking integer as input and calculating its factor

	System.out.println("Enter a number: ");
	int number=input.nextInt();

	int []factors=factors(number);
	int greatest=greatest(factors);
	int sum=sum(factors);
	int product=product(factors);
	int productOfCube=productOfCube(factors);

	System.out.print("Factors of "+number+" are : ");
	for(int i=0;i<factors.length;i++){
          if(factors[i]!=0)
	   System.out.print(factors[i]+" ");
	}
	System.out.println("Greatest factor: "+greatest);
	System.out.println("Sum of factors: "+sum);
	System.out.println("Product of factors: "+product);
	System.out.println("Product of Cube: "+productOfCube);



	input.close();
   }
   
    
}