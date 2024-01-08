package jpabasic.jpastudy.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

import java.util.Objects;

@Embeddable
public class Address {

  @Id @Getter
  private Long id;

  private String city;

  private String street;

  private String zipCode;

  public Address(String city, String street, String zipCode) {
    this.city = city;
    this.street = street;
    this.zipCode = zipCode;
  }

  public Address() {

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Address address = (Address) o;
    return Objects.equals(id, address.id) && Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(zipCode, address.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, city, street, zipCode);
  }
}
