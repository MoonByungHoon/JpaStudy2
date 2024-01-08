package jpabasic.jpastudy;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jpabasic.jpastudy.domain.*;
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

      Member member = new Member("member");

      member.getFavoriteFoods().add("피자");
      member.getFavoriteFoods().add("햄버거");
      member.getFavoriteFoods().add("아이스크림");

      member.getAddressHistory().add(new Address("top city", "street1", "100"));
      member.getAddressHistory().add(new Address("middle city", "street2", "200"));
      member.getAddressHistory().add(new Address("bottom city", "street3", "300"));

      em.persist(member);

      tx.commit();
    } catch (Exception e) {
      tx.rollback();
    } finally {
      em.close();
    }
    emf.close();
  }

}
