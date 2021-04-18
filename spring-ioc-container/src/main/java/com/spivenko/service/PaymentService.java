package com.spivenko.service;

public class PaymentService {
    private final PaymentProvider paymentProvider;

    public PaymentService(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public void purchaseSubscription() {
        paymentProvider.purchase("Monthly Subscription", 99);
    }
}
