package jpabasic.jpastudy.impl;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn
public class Item {

  @Id @GeneratedValue
  private Long id;

  private String name;
  private int price;
}
