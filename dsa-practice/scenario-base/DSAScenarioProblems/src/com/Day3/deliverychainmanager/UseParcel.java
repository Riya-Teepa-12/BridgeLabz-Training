package com.Day3.deliverychainmanager;

public class UseParcel {
    public static void main(String []args) {
    	ParcelTracker pt = new ParcelTracker();
    	  pt.addParcel("Packed");
    	  pt.addParcel("Shipped");
    	  pt.addParcel("In Transit");
    	  pt.addParcel("Delivered");
    	  
       
    	  ParcelTracker pt1 = new ParcelTracker();
    	  
    	 
    	  
    	  pt.showStages();
    	  pt.customStage("Start", 289);
    	  pt.showStages();
    	  pt1.addParcel("Packed");
    	  pt1.addParcel("Shipped");
    	  pt1.showStages();
    }
}
