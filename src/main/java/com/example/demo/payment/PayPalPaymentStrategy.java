package com.example.demo.payment;

public class PayPalPaymentStrategy implements Payment {
    public  String description = "PayPal";

    public String pay(double price) {
        return "Payed " + price + " ukrainian dollars with PayPal.";
    }
}
