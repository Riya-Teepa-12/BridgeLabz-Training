import java.util.Scanner;

class NumberCheck5{

    // method to find sum of proper divisors in the number
    public static int sumOfTheProperDivisors(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check whether the number is Perfect Number
    public static boolean isPerfectNumber(int number) {
        if (number <= 0)
            return false;

        return sumOfTheProperDivisors(number) == number;
    }

    // Method to check whether the number is Abundant Number
    public static boolean isAbundantNumber(int number) {
        if (number <= 0)
            return false;

        return sumOfTheProperDivisors(number)>number;
    }

    // Method to check whether the number is Deficient Number
    public static boolean isDeficientNumber(int number) {
        if (number <= 0)
            return false;

        return sumOfTheProperDivisors(number)<number;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check whether the number is  Strong Number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Perfect Number: " + isPerfectNumber(number));
        System.out.println("Abundant Number: " + isAbundantNumber(number));
        System.out.println("Deficient Number: " + isDeficientNumber(number));
        System.out.println("Strong Number: " + isStrongNumber(number));

        input.close();
    }
}
