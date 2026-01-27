package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.FIELD)         
@interface MaxLength {
    int value(); 
}


class User {

    @MaxLength(10) 
    private String username;

    public User(String username) throws Exception {
        this.username = username;
        validateFields();
    }

    // Step 3: Validate annotated fields
    private void validateFields() throws Exception {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                field.setAccessible(true);
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                Object value = field.get(this);

                if (value instanceof String) {
                    String str = (String) value;
                    if (str.length() > maxLength.value()) {
                        throw new IllegalArgumentException(
                            "Field '" + field.getName() + "' exceeds max length of " + maxLength.value()
                        );
                    }
                }
            }
        }
    }

    public String getUsername() {
        return username;
    }
}

public class UseUser{
    public static void main(String[] args) {
        try {
            User user1 = new User("John"); 
            System.out.println("User1 created: " + user1.getUsername());

            User user2 = new User("VeryLongUsername"); 
            System.out.println("User2 created: " + user2.getUsername());

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
