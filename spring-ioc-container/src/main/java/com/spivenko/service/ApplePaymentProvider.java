package com.spivenko.service;

public class ApplePaymentProvider implements PaymentProvider {
    @Override
    public void purchase(String sku, float price) {
        System.out.println("################################################################################");
        System.out.println(String.format("Purchasing item %s with price %s USD from Apple Store", sku, price));
        System.out.println("################################################################################");
    }
}
