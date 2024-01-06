package jpabasic.jpastudy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jpabasic.jpastudy.domain.Child;
import jpabasic.jpastudy.domain.Order;
import jpabasic.jpastudy.domain.OrderItem;
import jpabasic.jpastudy.domain.Parent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaStudyApplication {

  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

    EntityManager em = emf.createEntityManager();

    EntityTransaction tx = em.getTransaction();
    tx.begin();

    try {
      Child child1 = new Child();
      Child child2 = new Child();

      Parent parent = new Parent();
      parent.addChild(child1);
      parent.addChild(child2);

      em.persist(parent);

      tx.commit();
    } catch (Exception e) {
      tx.rollback();
    } finally {
      em.close();
    }
    emf.close();
  }

}
