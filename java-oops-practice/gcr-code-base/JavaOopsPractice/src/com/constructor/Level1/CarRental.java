package com.constructor.Level1;

public class CarRental {

		//Private attributes
		private String customerName;
		private String carModel;
		private int rentalDays;
		private double totalCost;

		// Default constructor
		public CarRental(){
			this.customerName="Unknown Customer";
			this.carModel="Factback";
			this.rentalDays=1;
			calculateCost();
		}

		// Parameterized constructor
		public CarRental(String custName,String carModel,int rentalDays){
			this.customerName=custName;
			this.carModel=carModel;
			this.rentalDays=rentalDays;
			calculateCost();
		}

		// Copy constructor
		public CarRental(CarRental rental){
			this.customerName=rental.customerName;
			this.carModel=rental.carModel;
			this.rentalDays=rental.rentalDays;
			this.totalCost=rental.totalCost;
		}

		// Method to calculate total cost
		private void calculateCost(){
			double rate;
			switch(carModel.toLowerCase()){
				case "divisha01":
					rate=3500;
					break;
				case "tuv":
					rate=8500;
					break;
				case "rockstar01":
					rate=2000;
					break;
				default:
					rate=9200;
			}
			totalCost=rate*rentalDays;
		}

		// Method to display rental details
		public void displayRental(){
			System.out.println("Customer Name:"+customerName);
			System.out.println("Car Model:"+carModel);
			System.out.println("Rental Days:"+rentalDays);
			System.out.println("Total Cost:"+totalCost);
			System.out.println("----------------------");
		}

		// Main method
		public static void main(String[] args){

			CarRental rent1=new CarRental();
			CarRental rent2=new CarRental("Jiya","tuv",3);
			CarRental rent3=new CarRental(rent2);

			rent1.displayRental();
			rent2.displayRental();
			rent3.displayRental();
		}
	}


