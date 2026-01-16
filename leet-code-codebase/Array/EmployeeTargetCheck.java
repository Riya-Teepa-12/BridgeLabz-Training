import java.util.Scanner;

public class EmployeeTargetCheck {
      //L-2798
    // Method to count employees who met or exceeded the target hours
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        // Loop through each employee's working hours
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] hours = new int[n];

        // Take working hours of each employee
        System.out.println("Enter working hours of employees:");
        for (int i = 0; i < n; i++) {
            hours[i] = sc.nextInt();
        }

        // Take target hours
        System.out.print("Enter target working hours: ");
        int target = sc.nextInt();

        // Call method and print result
        int result = numberOfEmployeesWhoMetTarget(hours, target);
        System.out.println("Employees who met the target: " + result);

        sc.close();
    }
}
