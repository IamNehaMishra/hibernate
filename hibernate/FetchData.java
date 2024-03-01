package hibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;

public class FetchData {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Student s = em.find(Student.class, 10);

		if(s !=null) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getAge());
		}
		else {
			System.out.println("Invalid");
		}
	}
		
}
