package ua.edu.ucu.apps.delivery;

import ua.edu.ucu.apps.Item.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
  public String getPostDeliveryStrategy() {
    return "Delivery with simple Post";
  }

  @Override
  public void deliver(List<Item> items) {
    System.out.println("Post items: " + items.size());
  }
}
