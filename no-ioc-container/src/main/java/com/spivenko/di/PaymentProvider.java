package com.spivenko.di;

public interface PaymentProvider {
    void purchase(String sku, float price);
}
