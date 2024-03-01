package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateShoeFactory {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		ShoeFactory s1=new ShoeFactory();
		
		s1.setId(102);
		s1.setBrand("Adidas");
		s1.setType("Shoe");
		s1.setCost(3000);
		
		et.begin();
		em.merge(s1);
		et.commit();
		
		s1.setId(104);
		s1.setBrand("Nike");
		s1.setType("Shoe");
		s1.setCost(2500);
		
		et.begin();
		em.merge(s1);
		et.commit();
		
		
	}
}
