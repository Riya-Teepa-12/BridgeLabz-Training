package com.Day1.optionalclassexamples.ecommerce;

import java.util.Optional;

public class Product {
    private String name;
    private Double price;
    private Discount discount;
    private Coupon coupon;
    private Seller seller;
    private String description;
    private DeliveryPartner deliveryPartner;

    public Product(String name, Double price, Discount discount, Coupon coupon,
                   Seller seller, String description, DeliveryPartner deliveryPartner) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.coupon = coupon;
        this.seller = seller;
        this.description = description;
        this.deliveryPartner = deliveryPartner;
    }

    public Optional<Discount> getDiscount() {
        return Optional.ofNullable(discount);
    }

    public Optional<Coupon> getCoupon() {
        return Optional.ofNullable(coupon);
    }

    public Optional<Seller> getSeller() {
        return Optional.ofNullable(seller);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<DeliveryPartner> getDeliveryPartner() {
        return Optional.ofNullable(deliveryPartner);
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
