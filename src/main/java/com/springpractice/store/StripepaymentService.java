package com.springpractice.store;

public class StripepaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        // Payment processing logic goes here
        System.out.println("STRIPE");
        System.out.println("Processing payment of $" + amount);
    }
    
}
