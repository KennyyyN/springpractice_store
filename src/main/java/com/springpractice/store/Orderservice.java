package com.springpractice.store;

public class Orderservice {
    public void processOrder() {
        // Order processing logic goes here
        PaymentService paymentService = new StripepaymentService();
        paymentService.processPayment(100.0);
        
    }
    
}
