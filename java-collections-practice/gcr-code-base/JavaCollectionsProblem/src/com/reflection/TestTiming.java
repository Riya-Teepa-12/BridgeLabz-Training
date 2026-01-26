package com.reflection;


import java.lang.reflect.Method;

class TaskService {

    public void fastTask() {
        for (int i = 0; i < 1_000; i++);
    }

    public void slowTask() {
        for (int i = 0; i < 1_000_000; i++);
    }
}
class MethodTimer {

    public static Object executeWithTiming(
            Object target,
            String methodName,
            Class<?>[] paramTypes,
            Object[] args) throws Exception {

        Class<?> clazz = target.getClass();

        Method method = clazz.getMethod(methodName, paramTypes);

        long start = System.nanoTime();
        
        Object result = method.invoke(target, args);
        long end = System.nanoTime();

        System.out.println(
                "Method " + methodName + " executed in " + (end - start) + " ns");

        return result;
    }
}
public class TestTiming {
	 public static void main(String[] args) throws Exception {

	        TaskService service = new TaskService();

	        MethodTimer.executeWithTiming(
	                service,
	                "fastTask",
	                new Class<?>[]{},
	                new Object[]{}
	        );
           
	        MethodTimer.executeWithTiming(
	                service,
	                "slowTask",
	                new Class<?>[]{},
	                new Object[]{}
	        );
	    }
}
