package ua.edu.ucu.apps.Item;

public class BasketDecorator extends ItemDecorator {

  BasketDecorator(Item item) {
    super(item);
  }

  @Override
  public double getPrice() {
    return 4 + super.getPrice();
  }

  @Override
  public String getDescription() {
    return "Decorated with basket.";
  }
}
