package com.example.demo.payment;

public class CreditCardPaymentStrategy implements Payment {
    public String pay(double price) {
        return "Payed " + price + " ukrainian dollars with Credit Card.";
    }

}
