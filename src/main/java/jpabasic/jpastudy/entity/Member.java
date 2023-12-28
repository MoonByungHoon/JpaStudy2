package jpabasic.jpastudy.entity;

import jakarta.persistence.*;
import jpabasic.jpastudy.domain.RoleType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member {

  @Id @GeneratedValue
  private Long id;

  private String username;

  private int age;

  @Enumerated(EnumType.STRING)
  private RoleType roleType;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdDate;

  @Temporal(TemporalType.TIMESTAMP)
  private Date lastModifiedDate;

  @Lob
  private String description;
}
