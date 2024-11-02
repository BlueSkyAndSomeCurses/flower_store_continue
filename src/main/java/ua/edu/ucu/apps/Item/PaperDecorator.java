package ua.edu.ucu.apps.Item;

public class PaperDecorator extends ItemDecorator {

  PaperDecorator(Item item) {
    super(item);
  }

  @Override
  public double getPrice() {
    return 13 + super.getPrice();
  }

  @Override
  public String getDescription() {
    return "Decorated with paper.";
  }
}
