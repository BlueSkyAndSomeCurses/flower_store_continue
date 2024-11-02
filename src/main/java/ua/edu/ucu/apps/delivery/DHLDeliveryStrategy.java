package ua.edu.ucu.apps.delivery;

import lombok.Getter;
import ua.edu.ucu.apps.Item.Item;

import java.util.List;

@Getter
public class DHLDeliveryStrategy implements Delivery {

  public String getDHLDeliveryStrategy() {
    return "DHL Strategy";
  }

  @Override
  public void deliver(List<Item> items) {
    System.out.println("DHL items: " + items.size());
  }

}