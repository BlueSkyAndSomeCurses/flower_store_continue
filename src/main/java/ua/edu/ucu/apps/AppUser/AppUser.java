package ua.edu.ucu.apps.AppUser;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
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
  String email;
  Gender gender;
  @Transient
  int age;
  LocalDate dateOfBirth;
  @Id
  private Long id;

  public int getAge() {
    return Period.between(dateOfBirth, LocalDate.now()).getYears();
  }
}
