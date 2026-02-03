package com.Day1.functionalinterface.consumerexamples;

import java.util.function.Consumer;

public class OrderConsumer {
       
	public static void main(String[] args) {

        Consumer<Integer> orderConfirmation =
                orderId -> System.out.println(
                        "Order placed successfully. Order ID: " + orderId);

        orderConfirmation.accept(1025);
    }
}
