package jpabasic.jpastudy.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

  @Id @GeneratedValue
  @Column(name = "order_id")
  private Long id;

  @Column(name = "member_id" )
  private Long memberId;
  private LocalDateTime orderDate;

  @Enumerated(EnumType.ORDINAL)
  private OrderStatus status;
}
