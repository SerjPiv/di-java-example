package com.spivenko.nodi;

public class ApplePaymentProvider {
    public void purchase(String sku, float price) throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("################################################################################");
        System.out.println(String.format("Purchasing item %s with price %s USD from Apple Store", sku, price));
        System.out.println("################################################################################");
    }
}
