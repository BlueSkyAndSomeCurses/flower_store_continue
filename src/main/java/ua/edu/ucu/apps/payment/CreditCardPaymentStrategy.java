package ua.edu.ucu.apps.payment;

public class CreditCardPaymentStrategy implements Payment {
    public String description = "Credit Card";

    public String pay(double price) {
        return "Payed " + price + " ukrainian dollars with Credit Card.";
    }

}
