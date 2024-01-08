package jpabasic.jpastudy.impl;

import jakarta.persistence.Entity;
import jpabasic.jpastudy.domain.Parent;

@Entity
public class Movie extends Item{

  private String director;
  private String actor;
}
