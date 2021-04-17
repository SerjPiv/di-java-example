package com.spivenko.configuration;

import com.spivenko.service.ApplePaymentProvider;
import com.spivenko.service.GooglePaymentProvider;
import com.spivenko.service.PaymentProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class PaymentProviderConfiguration {

    @Bean
    @Profile("apple")
    public PaymentProvider applePaymentProvider() {
        return new ApplePaymentProvider();
    }

    @Bean
    @Profile("google")
    public PaymentProvider googlePaymentProvider() {
        return new GooglePaymentProvider();
    }
}
