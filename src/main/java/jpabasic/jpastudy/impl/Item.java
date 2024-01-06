package jpabasic.jpastudy.impl;

import jakarta.persistence.*;
import jpabasic.jpastudy.domain.BaseEntity;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//기본값이 DTYPE이다.
@DiscriminatorColumn(name = "DTYPE")
public abstract class Item extends BaseEntity {

  @Id @GeneratedValue
  private Long id;

  private String name;
  private int price;
  private int stockQuantity;
}
