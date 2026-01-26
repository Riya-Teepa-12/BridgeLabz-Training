package com.reflection;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "DEFAULT_KEY";
}

public class ModifyStaticField {
	
	public static void main(String[] args) throws Exception {
    Class<?> cls = Class.forName("com.reflection.Configuration");

    Field field = cls.getDeclaredField("API_KEY");

    
    field.setAccessible(true);

    // Get original value (null for static fields)
    String oldKey = (String) field.get(null);
    System.out.println("Original API_KEY: " + oldKey);

    // Modify static field value
    field.set(null, "NEW_SECRET_KEY");

    // Get updated value
    String newKey = (String) field.get(null);
    System.out.println("Modified API_KEY: " + newKey);
  }

}
