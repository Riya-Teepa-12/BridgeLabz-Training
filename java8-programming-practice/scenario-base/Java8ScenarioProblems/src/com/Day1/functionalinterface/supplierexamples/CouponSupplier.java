package com.Day1.functionalinterface.supplierexamples;

import java.util.function.Supplier;
import java.util.Random;


public class CouponSupplier {
  
	public static void main(String[] args) {

        Supplier<String> couponSupplier = () -> {
            Random r = new Random();
            int discount = 10 + r.nextInt(41); // 10% to 50%
            return "SAVE" + discount;
        };

        System.out.println("Discount Coupon: " +
                couponSupplier.get());
    }
}
