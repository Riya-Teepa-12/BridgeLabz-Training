import java.util.*;
public class Calendar{
    // method to get the month
   static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }
     //method to check the year is leap or not
    static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    //method to get the days in the month
    static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

     //method to get the first day
    static int getFirstDay(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (1 + x + (31 * m) / 12) % 7;
        return d;
    }


   public static void main(String []args) {
        Scanner input=new Scanner(System.in);
        
        //taking input from the user
        System.out.print("Enter month (1-12): ");
        int month= input.nextInt();

        System.out.print("Enter year: ");
        int year= input.nextInt();

        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay= getFirstDay(month, year);
        int totalDays= getDaysInMonth(month, year);

        for (int i=0;i<firstDay;i++) {
            System.out.print("    ");
        }

        for (int day=1;day<=totalDays;day++) {
            System.out.printf("%3d ", day);

            if((day+firstDay)%7==0) {
                System.out.println(); 
            }
        }

        input.close();
    }

        
}
