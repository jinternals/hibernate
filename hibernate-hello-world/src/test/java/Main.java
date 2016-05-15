import com.jinternals.hibernate.entities.Person;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by mradul on 12/05/16.
 */
public class Main {

@Test
public void testPerson(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("helloUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

         Person person = new Person();
         person.setName("Mradul Pandey");
         person.setMessage("hello word");
         entityManager.persist(person);

         transaction.commit();
    }

}
