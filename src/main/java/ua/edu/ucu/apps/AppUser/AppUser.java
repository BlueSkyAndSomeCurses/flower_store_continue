package ua.edu.ucu.apps.AppUser;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@AllArgsConstructor
@Table(name = "app_user")
@Entity
@ToString
@NoArgsConstructor
public class AppUser {
  @Column(unique = true)
  String email;
  Gender gender;
  @Transient
  int age;
  LocalDate dateOfBirth;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  public int getAge() {
    return Period.between(dateOfBirth, LocalDate.now()).getYears();
  }
}
