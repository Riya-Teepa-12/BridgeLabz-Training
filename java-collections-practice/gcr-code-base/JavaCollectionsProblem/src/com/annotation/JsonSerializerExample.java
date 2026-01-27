package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.FIELD)         
@interface JsonField {
    String name(); 
}

class User1 {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    private int age; 

    public User1(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}

class JsonSerializer {

    public static String serialize(Object obj) throws IllegalAccessException {
        Class<?> cls = obj.getClass();
        Field[] fields = cls.getDeclaredFields();
        Map<String, String> jsonMap = new LinkedHashMap<>(); 

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);
                Object value = field.get(obj);

                String jsonValue;
                if (value instanceof String) {
                    jsonValue = "\"" + value + "\"";
                } else {
                    jsonValue = String.valueOf(value);
                }

                jsonMap.put(annotation.name(), jsonValue);
            }
        }

        // Build JSON string
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Iterator<Map.Entry<String, String>> iter = jsonMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            sb.append("\"").append(entry.getKey()).append("\": ").append(entry.getValue());
            if (iter.hasNext()) sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }
}


public class JsonSerializerExample {
    public static void main(String[] args) throws Exception {
        User1 user = new User1("Alice", "alice@example.com", 25);

        String json = JsonSerializer.serialize(user);
        System.out.println("Serialized JSON:");
        System.out.println(json);
    }
}
