import java.util.Scanner;

class NumberCheck3{

    // method to count digits in a number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // method to store digits in array
    public static int[] storeDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i=count-1; i>=0; i--) {
            digits[i]=number%10;
            number/=10;
        }
        return digits;
    }

    // method to reverse digits array
    public static int[] reverseTheArray(int[] digits) {
        int[] reversed=new int[digits.length];
        int index = 0;

        for (int i = digits.length-1; i >= 0; i--) {
            reversed[index++] = digits[i];
        }
        return reversed;
    }

    // method to compare two arrays
    public static boolean areArraysEqual(int[] arr1,int[] arr2) {
        if (arr1.length!=arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }

    // method to check whether the number ispalindrome using digits
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseTheArray(digits);
        return areArraysEqual(digits, reversed);
    }
	
	//method to check number is duck
   public static boolean isDuckNumber(int []digits){
	 for(int i=1;i<digits.length;i++){
	     if(digits[i]!=0)
		 {
		   return true;
		 }
	 }
	 return false;
   }

      public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = storeDigitsArray(number);
        int[] reversedDigits = reverseTheArray(digits);

        System.out.println("Count of digits: " + countDigits(number));

        System.out.print("Digits Array: ");
        for (int i=0;i<digits.length;i++)
            System.out.print(digits[i] + " ");

        System.out.print("Reversed Digits Array: ");
        for (int i=0;i<reversedDigits.length;i++)
            System.out.print(reversedDigits[i]+ " ");

        System.out.println("Arrays Equal: " +
                areArraysEqual(digits, reversedDigits));

        if (isPalindrome(digits))
            System.out.println(number + " is a Palindrome Number");
        else
            System.out.println(number + " is not a Palindrome Number");

        if (isDuckNumber(digits))
            System.out.println(number + " is a Duck Number");
        else
            System.out.println(number + " is not a Duck Number");

        input.close();
    }
}
