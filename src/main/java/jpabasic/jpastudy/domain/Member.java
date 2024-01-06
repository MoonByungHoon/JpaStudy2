package jpabasic.jpastudy.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter
public class Member extends BaseEntity{

  @Id @GeneratedValue
  @Column(name = "member_id")
  private Long id;

  private String name;

  private String city;
  private String street;
  private String zipcode;

  @OneToOne
  @JoinColumn(name = "locker_id")
  private Locker locker;

  @OneToMany(mappedBy = "member")
  private List<Order> orders = new ArrayList<>();
}
