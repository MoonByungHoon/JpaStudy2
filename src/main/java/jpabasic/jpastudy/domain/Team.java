package jpabasic.jpastudy.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter
public class Team {

  @Id @GeneratedValue
  @Column(name = "team_id")
  private Long id;

  private String name;
}
