package com.Day6.icecream;

public class UseIceCreamRush {
	 public static void main(String[] args) {

	        Flavor[] flavors = {
	            new Flavor("Vanilla", 120),
	            new Flavor("Chocolate", 340),
	            new Flavor("Mango", 220),
	            new Flavor("Strawberry", 180),
	            new Flavor("Butterscotch", 260),
	            new Flavor("Coffee", 150),
	            new Flavor("Pista", 200),
	            new Flavor("BlackCurrant", 300)
	        };

	        IceCreamRush.bubbleSort(flavors);

	        System.out.println("Flavors sorted by popularity:");
	        for (Flavor f : flavors) {
	            System.out.println(f.name + " → " + f.sales);
	        }
	    }
	}

