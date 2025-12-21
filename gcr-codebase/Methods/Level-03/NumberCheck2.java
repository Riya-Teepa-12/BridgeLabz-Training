import java.util.Scanner;

class NumberCheck2{

    // Method to find count of digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check Harshad Number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit using 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i=0;i<10;i++) {
            frequency[i][0]=i;
            frequency[i][1]=0;
        }
		for (int digi : digits) {
            frequency[digi][1]++;
        }

        return frequency;
    }

 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		//taking input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = getDigitsArray(number);
        //calling method and displaying the results
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        if (isHarshadNumber(number, digits)) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }

        
        System.out.println("Digit Frequency");
        int[][] frequency = digitFrequency(digits);
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("  " + frequency[i][0] + "   " + frequency[i][1]);
            }
        }

        input.close();
    }
}
