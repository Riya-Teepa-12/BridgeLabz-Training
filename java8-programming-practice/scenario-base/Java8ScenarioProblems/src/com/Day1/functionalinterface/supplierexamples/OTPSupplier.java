package com.Day1.functionalinterface.supplierexamples;

import java.util.function.Supplier;
import java.util.Random;

public class OTPSupplier {
       
	public static void main(String[] args) {

        Supplier<String> generateOTP = () -> {
            Random r = new Random();
            return String.valueOf(100000 + r.nextInt(900000));
        };

        System.out.println("OTP: " + generateOTP.get());
    }
}
