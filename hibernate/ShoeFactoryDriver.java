package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShoeFactoryDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		ShoeFactory s=new ShoeFactory();
		s.setId(101);
		s.setBrand("Puma");
		s.setType("Shoe");
		s.setCost(2000);

		ShoeFactory s1=new ShoeFactory();
		s1.setId(102);
		s1.setBrand("Nike");
		s1.setType("Shoe");
		s1.setCost(3000);

		et.begin();
		em.persist(s);
		et.commit();
		
	}


}
