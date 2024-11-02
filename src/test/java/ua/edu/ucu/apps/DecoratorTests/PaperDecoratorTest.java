package ua.edu.ucu.apps.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaperDecoratorTest {

  private Item item;

  @BeforeEach
  void setUp() {
    item = new Item() {
      @Override
      public double getPrice() {
        return 100; // Base price for testing
      }

      @Override
      public String getDescription() {
        return "Basic item";
      }
    };
  }

  @Test
  void testGetPrice() {
    Item decoratedItem = new PaperDecorator(item);
    assertEquals(113, decoratedItem.getPrice(), "Price should include paper decoration cost");
  }

  @Test
  void testGetDescription() {
    Item decoratedItem = new PaperDecorator(item);
    assertEquals("Decorated with paper.", decoratedItem.getDescription(), "Description should reflect paper decoration");
  }
}
