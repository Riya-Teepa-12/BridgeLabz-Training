package com.reflection;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.*;


class Students{
    private String name;
    private int age;
    private String course;

    public void display() {
        System.out.println(name + " | " + age + " | " + course);
    }
}

class ObjectMapperUtil {
	 public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {

	        try {
	          
	            T obj = clazz.getDeclaredConstructor().newInstance();

	           
	            for (Map.Entry<String, Object> entry : properties.entrySet()) {

	                String fieldName = entry.getKey();
	                Object fieldValue = entry.getValue();
	                Field field = clazz.getDeclaredField(fieldName);
	                field.setAccessible(true);
	                field.set(obj, fieldValue);
	            }

	            return obj;

	        } catch (Exception e) {
	            throw new RuntimeException("Error mapping object", e);
	      }
	 }
    
 }

public class TestMapper{
               
	    public static void main(String[] args) {
                
		        Map<String, Object> data = new HashMap<>();
		        data.put("name", "Prince");
		        data.put("age", 22);
		        data.put("course", "Java");
                
		        Students student = ObjectMapperUtil.toObject(Students.class, data);
		        student.display();
		 }
     }
 


   
