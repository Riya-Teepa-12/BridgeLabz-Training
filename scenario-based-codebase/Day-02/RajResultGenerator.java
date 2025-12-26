import java.util.Scanner;

public class RajResultGenerator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int marks;

        // Input marks for 5 subjects using for-loop
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            marks = input.nextInt();
            total += marks;
        }

        // Calculate average
        int average = total / 5;
        System.out.println("Average Marks: " + average);

        int gradeCalculate = average/10;
         
        switch (gradeCalculate) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
            case 7:
                System.out.println("Grade: B");
                break;
            case 6:
                System.out.println("Grade: C");
                break;
            case 5:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: Fail");
        }

        input.close();
    }
}
