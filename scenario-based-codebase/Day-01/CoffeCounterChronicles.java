import java.util.*;
 public class CoffeCounterChronicles{
      public static void main(String []args){
	    Scanner input = new Scanner(System.in);
		double sum=0;
		double totalSubtotal = 0;
        double totalGST = 0;

        String orderSummary = "";
		final double GST_RATE = 0.07;
		while(true){
		System.out.println("Enter your choice :");
		System.out.println("Type 1: Cafe Latte");
		System.out.println("Type 2: Cappucino");
		System.out.println("Type 3: Mochacino");
		System.out.println("Type 4: Americano");
		System.out.println("Type 5: Cold Coffee");
		System.out.println("Type 6: Hot coffe");
	    System.out.println("Type 7: Exit");
		int num = input.nextInt();
		
		if(num==7)
		{
		System.out.println("Thank you for visiting Riya's cafe");
		break;
		}
		double rateCoffee;
		switch(num){
		    case 1:
			rateCoffee = 120;
			break;
		    case 2:
			rateCoffee = 149;
			break;
		    case 3:
			rateCoffee = 150;
			break;
			case 4:
			rateCoffee = 125;
			break;
			case 5:
			rateCoffee = 145;
			break;
			case 6:
			rateCoffee = 120;
			break;
			default:
                System.out.println("Invalid coffee type! Please try again.");
                continue;
			
			}
		    System.out.print("Enter quantity: ");
            int quantity = input.nextInt();
            input.nextLine();
	
	        //calculating the bill
		    double subtotal = rateCoffee * quantity;
            double getAmount = subtotal * GST_RATE;
            double totalBill = subtotal + getAmount;
           
		  
			 totalSubtotal += subtotal;
            totalGST += getAmount;
              sum += totalBill;

            orderSummary += num + " (Qty: " + quantity + ")\n";

		}
					
			//display the bill
			System.out.println("\n========== FINAL BILL ==========");
            System.out.println("Ordered Coffee Types:");
            System.out.print(orderSummary);
 
            System.out.println("--------------------------------");
            System.out.println("Subtotal       : ₹" + totalSubtotal);
            System.out.println("Total GST (7%) : ₹" + totalGST);
            System.out.println("Total Payable  : ₹" + sum);
            System.out.println("================================");
            System.out.println("Thank you for your ordersss");

		input.close();
		
	  }
 }