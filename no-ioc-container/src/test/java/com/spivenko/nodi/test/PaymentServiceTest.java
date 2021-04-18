package com.spivenko.nodi.test;

import com.spivenko.nodi.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentServiceTest {

    private PaymentService paymentService;

    @BeforeEach
    public void setup() {
        paymentService = new PaymentService();
    }

    @Test
    public void testPurchase() throws InterruptedException {
        paymentService.purchaseSubscription();
    }
}
