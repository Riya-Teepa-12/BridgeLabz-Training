
import java.util.*;
public class GcdLcmCalculator{

//method to calculate the gcd
public static int gcdCalculate(int num1,int num2){

 while(num2!=0){
 int remain = num1 % num2;
  num1 = num2;
  num2 = remain;
  
 }
 return num1;
}

//method to calculate the lcm
public static int lcmCalculate(int num1,int num2){

 return (num1 * num2)/gcdCalculate(num1,num2);
}

public static void main(String []args){
Scanner input = new Scanner(System.in);
//take input from the user
System.out.println("Enter the number1 : ");
int number1 = input.nextInt();
System.out.println("Enter the number2 : ");
int number2 = input.nextInt();

//calling the method
int n1 = gcdCalculate(number1,number2);
int n2 = lcmCalculate(number1,number2);

//displaying the result
System.out.println("The GCD is: "+n1);
System.out.println("The LCM is: "+n2);
}

}