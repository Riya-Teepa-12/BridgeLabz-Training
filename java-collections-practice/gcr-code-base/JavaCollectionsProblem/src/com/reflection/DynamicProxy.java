package com.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Greeting {
    void sayHello(String name);
}

class GreetingImpl implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

class LoggingInvocationHandler implements InvocationHandler {

    private Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // Log before method execution
        System.out.println("[LOG] Method called: " + method.getName());

        // Call actual method
        return method.invoke(target, args);
    }
}

public class DynamicProxy {
	 public static void main(String[] args) {

	        Greeting realObject = new GreetingImpl();

	        Greeting proxyObject = (Greeting) Proxy.newProxyInstance(
	                Greeting.class.getClassLoader(),
	                new Class[]{Greeting.class},
	                new LoggingInvocationHandler(realObject)
	        );

	        
	        proxyObject.sayHello("Prince");
	    }
}

