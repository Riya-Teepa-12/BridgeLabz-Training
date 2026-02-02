package com.streams.foreach.stockpricelogger;

import java.util.Arrays;
import java.util.List;

public class StockPriceLogger {
	public static void main(String[] args){
        List<Double> stockPrices=Arrays.asList(
            1023.50,
            1018.75,
            1030.20,
            1025.10,
            1040.00
        );

        stockPrices.forEach(price->System.out.println("Stock Price: "+price));
    }
}
