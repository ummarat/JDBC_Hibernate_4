package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class AnimalHelper {
    EntityManagerFactory emf;
    EntityManager em;

    public AnimalHelper(){
        emf = Persistence.createEntityManagerFactory("mohr");
        em = emf.createEntityManager();
    }

    public void add(Animal a) {
        em.getTransaction().begin();
        em.merge(a);
        em.getTransaction().commit();
        emf.close();
    }

    public Animal getById(int id) {
        em.getTransaction().begin();
        Animal animal = em.find(Animal.class, id);
        em.getTransaction().commit();
        emf.close();
        return animal;
    }

    public void remove(Animal a) {
        em.getTransaction().begin();
        em.remove(a);
        em.getTransaction().commit();
        emf.close();
    }

    public List<Animal> getAll() {
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT animal FROM Animal animal");
        List<Animal> animals = query.getResultList();
        em.getTransaction().commit();
        emf.close();
        return animals;
    }
}
