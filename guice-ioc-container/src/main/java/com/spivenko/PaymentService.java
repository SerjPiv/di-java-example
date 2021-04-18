package com.spivenko;

import com.google.inject.Inject;

import static com.spivenko.configuration.BindingAnnotations.Google;

public class PaymentService {
    private final PaymentProvider paymentProvider;

    @Inject
    public PaymentService(@Google PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public void purchaseSubscription() {
        paymentProvider.purchase("Monthly Subscription", 99);
    }
}
