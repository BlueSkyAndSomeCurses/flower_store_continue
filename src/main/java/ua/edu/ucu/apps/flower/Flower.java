package ua.edu.ucu.apps.flower;

import jakarta.persistence.*;
import lombok.*;
import ua.edu.ucu.apps.Item.Item;

import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Entity
@Table(name = "flowers")
@NoArgsConstructor
public class Flower extends Item {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private double sepalLength;
  private FlowerColor color;
  private Integer price;
  private FlowerType flowerType;

  public Flower(Flower flower) {
    flowerType = flower.flowerType;
    sepalLength = flower.sepalLength;
    price = flower.price;
    color = flower.color;
  }

  public double getPrice() {
    return price;
  }

  public String getColor() {
    return color.toString();
  }

  public boolean match(Flower f) {
    return Objects.equals(this.price, f.getPrice()) && this.flowerType.equals(f.getFlowerType())
        && this.getSepalLength() == f.getSepalLength();
  }
}
