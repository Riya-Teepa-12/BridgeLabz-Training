package com.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}


class Calculator {


    public long factorial(int n) {
        System.out.println("Computing factorial of " + n);
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}

class CacheHandler {

    private static final Map<String, Map<Object, Object>> cache = new HashMap<>();

    public static Object invoke(Object obj, String methodName, Object... args) throws Exception {
        Method method = obj.getClass().getMethod(methodName, Arrays.stream(args)
                .map(Object::getClass)
                .map(cls -> cls == Integer.class ? int.class : cls) // handle int
                .toArray(Class[]::new));

        if (method.isAnnotationPresent(CacheResult.class)) {
            String key = methodName;
            Object arg = args.length > 0 ? args[0] : null;

            cache.putIfAbsent(key, new HashMap<>());
            Map<Object, Object> methodCache = cache.get(key);

            if (methodCache.containsKey(arg)) {
                System.out.println("Returning cached result for " + arg);
                return methodCache.get(arg);
            } else {
                Object result = method.invoke(obj, args);
                methodCache.put(arg, result);
                return result;
            }
        } else {
            return method.invoke(obj, args);
        }
    }
}

public class UseCalculator{
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();

        System.out.println("First call:");
        long result1 = (long) CacheHandler.invoke(calc, "factorial", 5);
        System.out.println("Result: " + result1);

        System.out.println("\nSecond call with same input:");
        long result2 = (long) CacheHandler.invoke(calc, "factorial", 5);
        System.out.println("Result: " + result2);

        System.out.println("\nCall with different input:");
        long result3 = (long) CacheHandler.invoke(calc, "factorial", 6);
        System.out.println("Result: " + result3);
    }
}
