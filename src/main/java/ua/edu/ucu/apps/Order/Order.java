package ua.edu.ucu.apps.Order;

import java.util.List;

import ua.edu.ucu.apps.delivery.Delivery;
import ua.edu.ucu.apps.payment.Payment;
import ua.edu.ucu.apps.Item.Item;
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

  public void processOrder() {
    payment.pay(calculateToaPrice());

    delivery.deliver(items);
  }

  void addItem(Item newItem) {
    items.add(newItem);
  }

  void removeItem(Item itemToRemove) {
    items.remove(itemToRemove);
  }
}
