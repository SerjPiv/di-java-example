package com.spivenko.nodi;

public class PaymentService {
    private final ApplePaymentProvider applePaymentProvider;

    public PaymentService() {
        this.applePaymentProvider = new ApplePaymentProvider();
    }

    public void purchaseSubscription() {
        applePaymentProvider.purchase("Monthly Subscription", 99);
    }
}
