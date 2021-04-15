package com.spivenko.di;

public class App {
    private static final String GOOGLE = "Google";
    private static final String APPLE = "Apple";

    public static void main(String[] args) {
        String provider = GOOGLE;
        PaymentService paymentService = null;
        if (provider.equals(GOOGLE)) {
            PaymentProvider googlePaymentProvider = new GooglePaymentProvider();
            paymentService = new PaymentService(googlePaymentProvider);
        } else if (provider.equals(APPLE)) {
            PaymentProvider applePaymentProvider = new ApplePaymentProvider();
            paymentService = new PaymentService(applePaymentProvider);
        }
        paymentService.purchaseSubscription();
    }
}
