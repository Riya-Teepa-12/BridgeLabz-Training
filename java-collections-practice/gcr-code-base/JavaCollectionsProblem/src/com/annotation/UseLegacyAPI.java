package com.annotation;


//Class with deprecated method
class LegacyAPI {

 // Old method that should not be used
 @Deprecated
 public void oldFeature() {
     System.out.println("This is the old feature. Avoid using it!");
 }

 // New method to replace oldFeature()
 public void newFeature() {
     System.out.println("This is the new feature. Use this instead!");
 }
}
public class UseLegacyAPI {
	public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature();  
        api.newFeature();  
    }
}
