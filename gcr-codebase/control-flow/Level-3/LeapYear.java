import java.util.*;
public class LeapYear{
  public static void main(String []args){
       Scanner input= new Scanner(System.in);
       //taking integer input for year and check for leap year
        System.out.println("Enter a year: ");
        int year= input.nextInt();
     //Finding leap year
       if(year<1582)
          System.out.println("Year is not Valid");
        else if(year%400==0)
           System.out.println(year+" is leap year");
	 else if(year %100==0)
            System.out.println(year+" is not leap year");
	  else if(year%4==0)
             System.out.println(year+" is leap year");
	   else
              System.out.println(year+" is not leap year");

	 input.close();
  }
}
