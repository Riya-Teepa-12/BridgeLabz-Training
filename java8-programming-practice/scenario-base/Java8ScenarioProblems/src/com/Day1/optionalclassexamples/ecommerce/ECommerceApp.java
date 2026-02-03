package com.Day1.optionalclassexamples.ecommerce;

public class ECommerceApp {
    public static void main(String[] args) {

        Product product = new Product(
                "Laptop",
                60000.0,
                null,                          // no discount
                new Coupon("SAVE10"),
                new Seller("TechStore"),
                null,                          // description missing
                new DeliveryPartner("BlueDart")
        );

        // 1. Apply default discount if not present
        double discountPercent = product.getDiscount()
                .map(Discount::getPercentage)
                .orElse(5.0);

        double discountedPrice =
                product.getPrice() - (product.getPrice() * discountPercent / 100);

        System.out.println("Final Price: " + discountedPrice);

        // 2. Fetch coupon code if present
        product.getCoupon()
                .ifPresent(c -> System.out.println("Coupon Applied: " + c.getCouponCode()));

        // 3. Display seller details safely
        product.getSeller()
                .ifPresent(s -> System.out.println("Seller: " + s.getName()));

        // 4. Product description fallback
        String description = product.getDescription()
                .orElse("No description available");
        System.out.println("Description: " + description);

        // 5. Delivery partner info
        product.getDeliveryPartner()
                .ifPresent(d -> System.out.println("Delivery Partner: " + d.getPartnerName()));
    }
}
