package ManyToMany_BiDirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		List<Visitor> visitor=new ArrayList<Visitor>();
		List<Museum> museum=new ArrayList();
		
		Visitor v1=new Visitor();
		v1.setId(2);
		v1.setName("Mala");
		v1.setAge(43);
		v1.setPhone(1234567890);
		visitor.add(v1);
		
		Museum m1=new Museum();
		m1.setId(4);
		m1.setName("Food Museum");
		m1.setAddress("Bangalore");
		museum.add(m1);
		m1.setVisitor(visitor);
		
		Museum m2=new Museum();
		m2.setId(5);
		m2.setName("Animal Museum");
		m2.setAddress("Delhi");
		museum.add(m2);
		m2.setVisitor(visitor);
		
		Museum m3=new Museum();
		m3.setId(6);
		m3.setName("Birds Museum");
		m3.setAddress("Chennai");
		museum.add(m3);
		m3.setVisitor(visitor);
		
		v1.setMuseum(museum);
		
		em.persist(m1);
		em.persist(m2);
		em.persist(m3);
		em.persist(v1);
		em.persist(m3);
		
		et.commit();
		
		}
}
