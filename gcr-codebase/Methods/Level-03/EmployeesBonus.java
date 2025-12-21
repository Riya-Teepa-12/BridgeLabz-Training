
import java.util.*;
public class EmployeesBonus{

    static final int EMPLOY_COUNT = 10;
	
	
	 // method tog generate salary and years of service
    public static int[][] generateSalaryAndService() {

        int[][] data = new int[EMPLOY_COUNT][2];

        for (int i = 0;i<EMPLOY_COUNT; i++) {
            data[i][0] =(int)(Math.random() * 90000)+10000; 
            data[i][1] =(int)(Math.random() * 10)+1;      
        }
        return data;
    }

    // method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] data) {

        double[][] result = new double[EMPLOY_COUNT][2];

        for (int i=0;i<EMPLOY_COUNT;i++) {

            int salary = data[i][0];
            int years = data[i][1];
            double bonus;

            if (years>5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;
            result[i][0] = salary + bonus; 
            result[i][1] = bonus;        
        }
        return result;
    }

    // method to display totals in tabular format
    public static void displaySummary(int[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("-----");

        for (int i=0;i<EMPLOY_COUNT;i++) {

            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];

            System.out.println((i + 1) + "\t" + oldData[i][0] + "\t\t" +
                               oldData[i][1] + "\t" +
                               String.format("%.2f", newData[i][1]) + "\t\t" +
                               String.format("%.2f", newData[i][0]));
        }

        System.out.println("---------");
        System.out.println("TOTAL\t" + totalOldSalary + "\t\t\t" +
                           String.format("%.2f", totalBonus) + "\t\t" +
                           String.format("%.2f", totalNewSalary));
    }

    public static void main(String[] args) {

        int[][] employeeData = generateSalaryAndService();
        double[][] salaryDetails = calculateNewSalaryAndBonus(employeeData);

        displaySummary(employeeData, salaryDetails);
    }

   
}
