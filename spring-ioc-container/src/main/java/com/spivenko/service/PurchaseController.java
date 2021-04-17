package com.spivenko.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {

    private final PaymentService paymentService;

    public PurchaseController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @RequestMapping("/purchase")
    public void purchase() {
        paymentService.purchaseSubscription();
    }
}
