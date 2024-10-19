package com.example.demo;

import java.util.List;

import com.example.demo.delivery.Delivery;
import com.example.demo.payment.Payment;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Order {

    @Setter
    private List<Item> items;
    private Delivery delivery;
    private Payment payment;

    public Order(List<Item> items, Delivery delivery) {
        this.items = items;
        this.delivery = delivery;
    }


    public double calculateToaPrice() {
        double total_price = 0;

        for (Item item : items) {
            total_price += item.getPrice();
        }

        return total_price;
    }

    public String processOrder() {
        return delivery.getDeliveryNotification() + '\n' + payment.pay(calculateToaPrice());
    }

    void addItem(Item newItem) {
        items.add(newItem);
    }

    void removeItem(Item itemToRemove) {
        for (Item item : items) {
            if (item.equals(itemToRemove)) {
                items.remove(item);
                break;
            }
        }
    }
}
