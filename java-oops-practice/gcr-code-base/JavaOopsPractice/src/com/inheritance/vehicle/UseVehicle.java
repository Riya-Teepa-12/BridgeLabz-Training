package com.inheritance.vehicle;

public class UseVehicle {
	public static void main(String []args) {
		Vehicle v = new Car(40,"petrol",5);
		    v.displayInfo();
		System.out.println("----------------");
		v= new Truck(45,"diesel",2000000);
		  v.displayInfo();
		System.out.println("----------------");
		v = new MotorCycle(50,"petrol",55);
		v.displayInfo();
		System.out.println("----------------");
		  
	}

}
