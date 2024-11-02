package ua.edu.ucu.apps.flower;

import ua.edu.ucu.apps.Item.Item;

import java.util.List;
import java.util.ArrayList;

public class FlowerBucket extends Item {
  private List<FlowerPack> flowerPacks;

  public FlowerBucket() {
    flowerPacks = new ArrayList<>();
  }

  public void add(FlowerPack flowerPack) {
    flowerPacks.add(flowerPack);
  }

  public double getPrice() {
    double price = 0;
    for (FlowerPack flowerPack : flowerPacks) {
      price += flowerPack.getPrice();
    }
    return price;
  }
}
