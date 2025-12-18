import java.util.Scanner;
public class EmployeesBonus{
    public static void main(String []args){
           //creating object of Scanner and taking salary and year of service in the year as input from user
          Scanner input=new Scanner(System.in);
           double salary=t.nextInt();
           int year=input.nextInt();
   
          //checking for the bonuses of employees based on their years of service.
           int bonusAmount=0;
          if(year<5){
            System.out.println("bonusAmount is equal to"+" " +bonusAmount);
          }
          else{
             bonusAmount=(salary*5)/100;
             System.out.println("bonusAmount is equal to"+" " +bonusAmount);
          }         
            
          input.close();

         }
}