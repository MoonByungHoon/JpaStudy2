package jpabasic.jpastudy.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Setter @Getter
public class Member extends BaseEntity{

  @Id @GeneratedValue
  @Column(name = "member_id")
  private Long id;

  private String name;

  @Embedded
  private Address address;

  @ElementCollection
  @CollectionTable(name = "favorite_food", joinColumns =
    @JoinColumn(name = "member_id"))
  @Column(name = "food_name")
  private Set<String> favoriteFoods = new HashSet<>();

  @ElementCollection
  @CollectionTable(name = "address", joinColumns =
    @JoinColumn(name = "member_id"))
  private List<Address> addressHistory = new ArrayList<>();

  @OneToOne
  @JoinColumn(name = "locker_id")
  private Locker locker;

  @OneToMany(mappedBy = "member")
  private List<Order> orders = new ArrayList<>();

  public Member(String name) {
    this.name = name;
  }
}
