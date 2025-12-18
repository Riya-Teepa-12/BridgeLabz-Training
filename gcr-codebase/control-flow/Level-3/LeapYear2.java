import java.util.*;
public class LeapYear2{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
       //taking integer input for year and check for leap year

       System.out.println("Enter a year: ");
        int year= input.nextInt();

       //Finding leap year
         if(year>=1582 && (year%400==0 || year%100!=0) && year%4==0)
            System.out.println(year+" is leap year");
	   else
             System.out.println(year+" is not leap year");

	 input.close();
  }
}

