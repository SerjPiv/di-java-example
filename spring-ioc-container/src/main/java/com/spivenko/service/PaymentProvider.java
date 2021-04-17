package com.spivenko.service;

public interface PaymentProvider {
    void purchase(String sku, float price);
}
