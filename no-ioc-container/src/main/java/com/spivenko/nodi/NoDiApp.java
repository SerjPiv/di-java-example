package com.spivenko.nodi;

public class NoDiApp {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.purchaseSubscription();
    }
}
