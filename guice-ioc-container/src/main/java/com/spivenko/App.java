package com.spivenko;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.spivenko.configuration.PaymentProviderConfiguration;

public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new PaymentProviderConfiguration());
        PaymentService paymentService = injector.getInstance(PaymentService.class);

        paymentService.purchaseSubscription();
    }
}
