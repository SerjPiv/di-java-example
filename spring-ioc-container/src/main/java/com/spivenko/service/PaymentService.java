package com.spivenko.service;

public class PaymentService {
    private final PaymentProvider applePaymentProvider;

    public PaymentService(PaymentProvider applePaymentProvider) {
        this.applePaymentProvider = applePaymentProvider;
    }

    public void purchaseSubscription() {
        applePaymentProvider.purchase("Monthly Subscription", 99);
    }
}
