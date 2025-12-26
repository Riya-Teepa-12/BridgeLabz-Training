import java.util.*;
class EmployeesBonus{
   public static void main(String []args){
        //creating object of scanner for taking input
          Scanner input= new Scanner(System.in);
      
          int totalEmployees=10;
        //declaring double array 
         double salary[] =new double[10];
         double yearsService[] =new double[10];

         double[] newSalary = new double[totalEmployees];
     
        // Variables to store totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

       //taking input for 10 of the employees
        for(int i=0;i<10;i++){
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.println("Enter Salary: ");

            double sal = input.nextDouble();

            System.out.println("Enter years of service: ");

            double years = input.nextDouble();

           if (sal <= 0 || years < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; 
                continue;
            }
           salary[i]=sal;
           yearsService[i]=years;
        }
        for(int i=0; i<10;i++){
           if (yearsService[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02; 
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Old Salary   : " + totalOldSalary);
        System.out.println("Total Bonus Paid   : " + totalBonus);
        System.out.println("Total New Salary   : " + totalNewSalary);

        input.close();
         
    }
}