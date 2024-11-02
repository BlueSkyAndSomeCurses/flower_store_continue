package ua.edu.ucu.apps.Item;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KibbonDecoratorTest {

  private Item item;

  @BeforeEach
  void setUp() {
    item = new Item() {
      @Override
      public double getPrice() {
        return 100;
      }

      @Override
      public String getDescription() {
        return "Basic item";
      }
    };
  }

  @Test
  void testGetPrice() {
    Item decoratedItem = new KibbonDecorator(item);
    assertEquals(140, decoratedItem.getPrice());
  }

  @Test
  void testGetDescription() {
    Item decoratedItem = new KibbonDecorator(item);
    assertEquals("Decorated with basket.", decoratedItem.getDescription());
  }
}
