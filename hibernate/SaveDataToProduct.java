package hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDataToProduct {
	public static void main(String[] args) {
		saveData();
	}

	public static void saveData() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the brand");
		String brand = sc.next();
		System.out.println("Enter type");
		String type = sc.next();
		System.out.println("Enter cost");
		int cost = sc.nextInt();

		Product p = new Product();
		p.setId(id);
		p.setBrand(brand);
		p.setType(type);
		p.setCost(cost);

		et.begin();
		em.persist(p);
		et.commit();
		sc.close();
		System.out.println("Data Saved Successfully");
	}

}
