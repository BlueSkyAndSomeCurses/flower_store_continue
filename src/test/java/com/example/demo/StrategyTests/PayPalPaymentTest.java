package com.example.demo.StrategyTests;

import com.example.demo.payment.PayPalPaymentStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PayPalPaymentTest {
    PayPalPaymentStrategy payPalPaymentStrategy;
    double price;
    @BeforeEach
    void setUp() {
        payPalPaymentStrategy = new PayPalPaymentStrategy();
        price  = 333;
    }

    @Test
    void messageTest() {
        Assertions.assertEquals(payPalPaymentStrategy.pay(price), "Payed " + price + " ukrainian dollars with PayPal.");
    }

    @Test
    void descriptionTest() {
        Assertions.assertEquals(payPalPaymentStrategy.description, "PayPal");
    }

}
