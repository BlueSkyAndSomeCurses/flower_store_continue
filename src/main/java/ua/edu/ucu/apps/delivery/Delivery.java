package ua.edu.ucu.apps.delivery;

import ua.edu.ucu.apps.Item.Item;

import java.util.List;

public interface Delivery {
  public void deliver(List<Item> items);
}
