package com.spivenko;

public interface PaymentProvider {
    void purchase(String sku, float price);
}
