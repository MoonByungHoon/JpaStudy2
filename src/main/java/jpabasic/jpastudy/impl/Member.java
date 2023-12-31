package jpabasic.jpastudy.impl;

import jakarta.persistence.*;
import jpabasic.jpastudy.domain.Team;

@Entity
public class Member {

  @Id @GeneratedValue
  private Long id;

  private String username;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn
  private Team team;
}
