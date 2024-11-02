package ua.edu.ucu.apps.StrategyTests;

import ua.edu.ucu.apps.payment.CreditCardPaymentStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardPaymentTest {
    CreditCardPaymentStrategy paymentStrategy;
    double price;

    @Test
    void testPayment() {
        paymentStrategy = new CreditCardPaymentStrategy();

        double price = 10;
        Assertions.assertEquals(paymentStrategy.pay(price), "Payed " + price + " ukrainian dollars with Credit Card.");
    }

    @Test
    void testDescription() {
        paymentStrategy = new CreditCardPaymentStrategy();

        Assertions.assertEquals(paymentStrategy.description, "Credit Card");
    }

}
