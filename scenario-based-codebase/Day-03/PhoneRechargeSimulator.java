import java.util.Scanner;

public class PhoneRechargeSimulator{

    public static void main(String[] args) {
        
		//create scanner object to take input from the user
        Scanner input = new Scanner(System.in);
		
		double balance=0.0;
		char ch='Y';
		int choice=0;
		
		//using do while for taking input and displaying the offer using switch case
		do{
		   System.out.println("Welcome to phone Recharge Simulator");
		   System.out.println("1.Jio\n2.Airtel\n3.BSNL\n4.VI");
		   System.out.println("Enter your choice : ");
		    choice =input.nextInt();
		   double amt=0.0;
		    switch (choice) {
                case 1:
                    System.out.println("Jio Offer: Extra 1GB/day for 28 days Available Recharge amount\n500\n800");
					System.out.println("Enter the recharge Amount");
				     amt = input.nextDouble();
					balance+=amt;
                    break;

                case 2:
                    System.out.println("Airtel Offer: Unlimited calls + 100 SMS/day Available Recharge amount\n300\n800");
					System.out.println("Enter the recharge Amount");
					amt = input.nextDouble();
					balance+=amt;
                    break;

                case 3:
                    System.out.println("BSNL Offer: Weekend data rollover  Available Recharge amount\n1000");
					System.out.println("Enter the recharge Amount");
				    amt = input.nextDouble();
					balance+=amt;
                    break;
					
			    case 4:
                    System.out.println("VI Offer: monthly data rollover  Available Recharge amount\n2000");
					System.out.println("Enter the recharge Amount");
				    amt = input.nextDouble();
					balance+=amt;
                    break;

                default:
                    System.out.println("Invalid operator selected");
            }
			
		
            System.out.println("Current Balance: " + balance);

          //asking again for recharge
            System.out.print("\nDo you want to recharge again? (Y/N): ");
              ch = input.next().charAt(0);
		
		   
		}while(ch=='Y');
		
        
        System.out.println("Thank you for using Phone Recharge Simulator!");
		

        input.close();
    }
}
