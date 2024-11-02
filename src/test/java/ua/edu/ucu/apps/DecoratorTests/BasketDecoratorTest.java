package ua.edu.ucu.apps.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasketDecoratorTest {

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
    Item decoratedItem = new BasketDecorator(item);
    assertEquals(104, decoratedItem.getPrice());
  }

  @Test
  void testGetDescription() {
    Item decoratedItem = new BasketDecorator(item);
    assertEquals("Decorated with basket.", decoratedItem.getDescription());
  }
}
