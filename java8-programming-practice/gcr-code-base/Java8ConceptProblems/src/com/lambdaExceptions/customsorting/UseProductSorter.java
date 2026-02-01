package com.lambdaExceptions.customsorting;

import java.util.Comparator;
import java.util.List;

 enum CampaignType {
    PRICE,
    RATING,
    DISCOUNT
}

public class UseProductSorter {
       
	public static void sortProducts(List<Product> products, CampaignType campaign) {

        Comparator<Product> comparator;

        switch (campaign) {

            case PRICE:
                comparator = (p1, p2) ->
                        Double.compare(p1.getPrice(), p2.getPrice());
                break;

            case RATING:
                comparator = (p1, p2) ->
                        Double.compare(p2.getRating(), p1.getRating());
                break;

            case DISCOUNT:
                comparator = (p1, p2) ->
                        Double.compare(p2.getDiscount(), p1.getDiscount());
                break;

            default:
                throw new IllegalArgumentException("Invalid Campaign");
        }

        products.sort(comparator);
    }
}
