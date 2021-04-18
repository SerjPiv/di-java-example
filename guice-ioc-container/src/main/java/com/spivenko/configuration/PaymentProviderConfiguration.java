package com.spivenko.configuration;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.spivenko.ApplePaymentProvider;
import com.spivenko.GooglePaymentProvider;
import com.spivenko.PaymentProvider;

import static com.spivenko.configuration.BindingAnnotations.*;

public class PaymentProviderConfiguration extends AbstractModule {
    @Provides
    @Apple
    static PaymentProvider paymentProvider(ApplePaymentProvider applePaymentProvider) {
        return applePaymentProvider;
    }

    @Provides
    @Google
    static PaymentProvider paymentProvider(GooglePaymentProvider googlePaymentProvider) {
        return googlePaymentProvider;
    }
}
