package hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			
			Student s = new Student();
			
			s.setId(id);
			s.setAge(age);
			s.setName(name);

			et.begin();
			em.persist(s);
			et.commit();
			System.out.println("Data saved");

		}
	}
}
