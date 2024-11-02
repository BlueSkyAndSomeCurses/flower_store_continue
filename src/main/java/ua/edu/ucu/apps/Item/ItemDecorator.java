package ua.edu.ucu.apps.Item;

public class ItemDecorator extends Item {

  private Item item;

  ItemDecorator(Item item) {
    this.item = item;
  }

  @Override
  public double getPrice() {
    return item.getPrice();
  }
}
