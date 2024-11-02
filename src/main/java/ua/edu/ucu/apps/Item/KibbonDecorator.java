package ua.edu.ucu.apps.Item;

public class KibbonDecorator extends ItemDecorator {

  KibbonDecorator(Item item) {
    super(item);
  }

  @Override
  public double getPrice() {
    return 40 + super.getPrice();
  }

  @Override
  public String getDescription() {
    return "Decorated with basket.";
  }
}
