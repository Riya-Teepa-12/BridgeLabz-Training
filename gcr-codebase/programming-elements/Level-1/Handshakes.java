import java.util.Scanner;

class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of students as input
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculating maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying the result
        System.out.println("Maximum number of handshakes is: " + handshakes);
    }
}
