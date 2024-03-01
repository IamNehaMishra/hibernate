package hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateShoeFactoryDynamically {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		
		System.out.println("Enter the Brand");
		String Brand=sc.nextLine();
		
//		ShoeFactory s1=new ShoeFactory();
		
//		if(s1!=null) {
//			s1.setId(id);
//			s1.setBrand(Brand);
//			s1.setType("Shoe");
//			s1.setCost(3000);
//		}
//		et.begin();
//		em.merge(s1);
//		et.commit();
//		
//		System.out.println("data updated successfully");
		
		ShoeFactory s1=em.find(ShoeFactory.class,id);
		s1.setBrand(Brand);
		
		et.begin();
		em.merge(s1);
		et.commit();
		

		System.out.println("data updated successfully");
		
	}
}
