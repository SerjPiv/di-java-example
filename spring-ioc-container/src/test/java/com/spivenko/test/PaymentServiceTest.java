package com.spivenko.test;

import com.spivenko.service.ApplePaymentProvider;
import com.spivenko.service.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PaymentServiceTest {

    @Mock
    private ApplePaymentProvider applePaymentProvider;
    private PaymentService paymentService;

    @BeforeEach
    public void setup() {
        paymentService = new PaymentService(applePaymentProvider);
    }

    @Test
    public void testPurchase() {
        paymentService.purchaseSubscription();
        verify(applePaymentProvider, times(1)).purchase("Monthly Subscription", 99);
    }
}
