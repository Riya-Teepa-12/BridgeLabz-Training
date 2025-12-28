package com.constructor.Level1;

public class Person {
	
		//attributes
		private String name;
		private int age;
		private double income;
		
		//parameterized constructor
		public Person(String name, int age, double income) {
			this.name = name;
			this.age = age;
			this.income = income;
		}
		public Person(Person p) {
			this.name =p.name;
			this.age =p.age;
			this.income =p.income;
			
		}
		
		//display method
		public void display() {
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Income:"+income);
		}
	public static void main(String[] args) {
			
			// creating object
			Person p1=new Person("Jiya",44,86004.0);
			Person p2=new Person(p1);
			System.out.println("person 1");
			p1.display();
			System.out.println("--------------------");
			System.out.println("person 2");
			p2.display();
				
		

	}
}
