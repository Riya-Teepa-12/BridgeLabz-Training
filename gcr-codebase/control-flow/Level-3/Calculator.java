import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
	//taking integer input for calculator using switch..case

        System.out.println("Enter a First number:");
        double first= input.nextDouble();
	System.out.println("Enter a Second number:");
        double second= input.nextDouble();
	System.out.println("Enter operator (+,-,*,/)");
	String op=input.next();

	//Performing required operation for calculation
	switch(op){		
	   case "+":
    	   System.out.println(first+second);
  	   break;
	   case "-":
	   System.out.println(first-second);
	   break;
	   case "*":
	   System.out.println(first*second);
	   break;
	   case "/":
	   System.out.println(first/second);
	   break;
	   default:
	   System.out.println("Invalid Operator");
	}

	input.close();
    }
}

