import java.util.Scanner;

public class Calculator{

	// method to perform addition
	public static double add(double a,double b){
		return a+b;
	}

	// method to perform subtraction
	public static double subtract(double a,double b){
		return a-b;
	}

	//method to perform multiplication
	public static double multiply(double a,double b){
		return a*b;
	}

	// method to perform division
	public static double divide(double a,double b){
		if(b==0){
			System.out.println("Division by zero not allowed");
			return 0;
		}
		return a/b;
	}

	public static void main(String[] args){

		Scanner input=new Scanner(System.in);

		// taking numbers
		System.out.println("Enter first number");
		double first=input.nextDouble();

		System.out.println("Enter second number");
		double second=input.nextDouble();

		// choosing operation
		System.out.println("Choose operation");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		int choice=input.nextInt();
		double res=0;

		switch(choice){
			case 1:
				res =add(first,second);
				break;
			case 2:
				res =subtract(first,second);
				break;
			case 3:
				res =multiply(first,second);
				break;
			case 4:
				res =divide(first,second);
				break;
			default:
				System.out.println("Invalid choice");
				input.close();
				return;
		}

		System.out.println("Result = "+res);
		input.close();
	}
}