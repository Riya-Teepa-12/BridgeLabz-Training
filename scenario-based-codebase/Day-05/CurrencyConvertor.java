
import java.util.*;

public class CurrencyConvertor{
      public static void main(String []args){
	     //create scanner object to takw input from user
	     Scanner input = new Scanner(System.in);
		 char ch = 'Y';
		 
		 //using do-while for converting the rupee again and again into other form
		 do{
		   System.out.println("Enter the amount in rupees:");
		   int amount = input.nextInt();
		    System.out.println("In what you want rupees to convert\n1.Euro\n2.Dollar\n3.Pound\n4.Yen");
			System.out.println("Enter your chloice ?");
			int choice = input.nextInt();
			switch(choice){
			  case 1:
			  System.out.println("The rupee in euro is "+(0.009 * amount));
			  break;
			  case 2:
			  System.out.println("The rupee in dollar is "+(0.011 * amount));
			  break;
			  case 3:
			  System.out.println("The rupee in pound is "+(0.008 * amount));
			  break;
			  case 4:
			  System.out.println("The rupee in Yen is "+(1.739 * amount));
			  break;
			  default:
			  System.out.println("Invalid Input:");
			}
			System.out.println("Do you want to convert again?");
			  ch=input.next().charAt(0);
			}while(ch=='Y');
			System.out.println("Thank you!");
			input.close();
	  }
}