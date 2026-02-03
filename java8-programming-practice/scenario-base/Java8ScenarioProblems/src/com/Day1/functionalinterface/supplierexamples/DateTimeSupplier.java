package com.Day1.functionalinterface.supplierexamples;

import java.util.function.Supplier;
import java.time.LocalDateTime;

public class DateTimeSupplier {
        
	public static void main(String[] args) {

        Supplier<LocalDateTime> dateTimeSupplier =
                () -> LocalDateTime.now();

        System.out.println("Current Date & Time: " +
                dateTimeSupplier.get());
    }
}
