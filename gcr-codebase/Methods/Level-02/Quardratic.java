import java.util.*;

class Quardratic{

    //declaring a method to find rootOfQuadratic equations
	public double[] rootsOfQuadraticEquations(double a, double b, double c){
	  double delta = Math.pow(b,2) + 4 * a * c;
	  double []result;
	  if(delta>0){
	   result = new double[2];
	   result[0] = (-b + Math.sqrt(delta)/(2 * a));
	   result[1] = (-b + Math.sqrt(delta)/(2 * a));
	  }
	  else if(delta==00){
	    result = new double[1];
		result[0]=-b/(2.0 * a);
	  }
	  else{
	  return new double[0];
	  }
	  return result;
	}
   
  public static void main(String []args){
   //creating object of scanner class for taking input from the user
    Scanner input= new Scanner(System.in);
	
	//taking number a,b,c as input from user
	System.out.println("Enter the a: ");
	double a=input.nextDouble();
	
	System.out.println("Enter the b: ");
	double b=input.nextDouble();
	
	System.out.println("Enter the c: ");
	double c=input.nextDouble();
	
	//calling the method
	Quardratic out =new Quardratic();
	double ans[] = out.rootsOfQuadraticEquations(a,b,c);
	
	//displaying the result
	for(int i=0;i<ans.length;i++){
	System.out.println(ans[i]);
	}
	
	

	input.close();
	
	
   }
}