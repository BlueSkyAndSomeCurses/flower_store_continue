package ua.edu.ucu.apps.Item;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Item {
  private double price;
  private String description;
  public abstract double getPrice();
}
