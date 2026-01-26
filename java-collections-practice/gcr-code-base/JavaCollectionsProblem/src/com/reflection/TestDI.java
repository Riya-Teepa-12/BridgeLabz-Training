package com.reflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
}

class EmailService {
    public void sendEmail() {
        System.out.println("Email sent!");
    }
}

class UserService {

    @Inject
    private EmailService emailService;

    public void process() {
        emailService.sendEmail();
    }
}

class TestObject {
	private Map<Class<?>, Object> instances = new HashMap<>();

    public <T> T getBean(Class<T> clazz) {
        try {
           
            if (!instances.containsKey(clazz)) {
                T obj = clazz.getDeclaredConstructor().newInstance();
                instances.put(clazz, obj);

                
                injectDependencies(obj);
            }
            return clazz.cast(instances.get(clazz));

        } catch (Exception e) {
            throw new RuntimeException("Failed to create bean", e);
        }
    }

    private void injectDependencies(Object obj) throws Exception {

        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {

            if (field.isAnnotationPresent(Inject.class)) {

                Class<?> fieldType = field.getType();

               
                Object dependency = getBean(fieldType);

                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }
    }
}

public class TestDI{

    public static void main(String[] args) {

        TestObject container = new TestObject();

        UserService userService = container.getBean(UserService.class);
        userService.process();
    }
}

