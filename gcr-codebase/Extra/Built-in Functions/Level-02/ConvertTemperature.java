import java.util.*;

public class ConvertTemperature{

    // method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    //method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int ch = input.nextInt();

        if (ch == 1){
            System.out.print("Enter temperature in Celsius: ");
            double c = input.nextDouble();
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(c));
        } 
        else if(ch == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = input.nextDouble();
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(f));
        } 
        else {
            System.out.println("Invalid choice!");
        }

        input.close();
    }
}
