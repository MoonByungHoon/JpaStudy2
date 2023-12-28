package jpabasic.jpastudy.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Catagory {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @ManyToOne
  @JoinColumn(name = "parent_id")
  private Catagory parent;

  @OneToMany(mappedBy = "parent")
  private List<Catagory> child = new ArrayList<>();

  @ManyToMany
  @JoinTable(name = "category_id",
          joinColumns = @JoinColumn(name = "category_id"),
          inverseJoinColumns = @JoinColumn(name = "item_id")
  )
  private List<Item> items = new ArrayList<>();
}
