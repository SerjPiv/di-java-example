package com.spivenko.configuration;

import com.spivenko.service.PaymentProvider;
import com.spivenko.service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentServiceConfiguration {

    @Bean
    PaymentService paymentService(PaymentProvider paymentProvider) {
        return new PaymentService(paymentProvider);
    }
}
