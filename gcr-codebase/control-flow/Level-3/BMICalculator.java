import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
	//taking integer input as weight and height for calculating BMI
       System.out.print("enter weight in kg: ");
        double weight= input.nextDouble();
        System.out.print("enter height in centimeters: ");
        double height= input.nextDouble();
	height/=100;
        //calculating BMI
        double bmi= weight/(height*height);

        System.out.println("BMI= " + bmi);
         //displaying the result according to the bmi
	if(bmi<=18.4)
          System.out.println("Status: Underweight");
         else if(bmi>=18.5 && bmi<=24.9)
           System.out.println("Status: Normal weight");
          else if(bmi>=25 && bmi<=39.9)
            System.out.println("Status: Overweight");
           else if(bmi>=40)
             System.out.println("Status: Obese");

        input.close();
    }
}
