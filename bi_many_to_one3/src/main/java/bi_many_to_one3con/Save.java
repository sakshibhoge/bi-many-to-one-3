package bi_many_to_one3con;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import bi_many_to_one3.Employee;
import bi_many_to_one3.Manager;

public class Save {

	
public static void  main(String[]args) {
		
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("bi_many_to_one");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
	
		Manager manager1 = new Manager();
		manager1.setId(1);
		manager1.setName("Piyush");
		manager1.setManagerPosition("senior Manager");
		manager1.setDepartment("IT");
		manager1.setSalary(50000);
		manager1.setHireDate(LocalDate.now());
		manager1.setPerformanceRating(2.5);
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		employee1.setId(101);
		employee2.setId(102);
		
		employee1.setName("vishal");
		employee2.setName("sujit");
		
		employee1.setPostion("Developer");
		employee2.setPostion("Senior Developer");
		
		employee1.setDepartment("IT");
		employee2.setDepartment("IT");
		
		employee1.setSalary(20000);
		employee2.setSalary(30000);
		
		employee1.setHireDate(LocalDate.now());
		employee2.setHireDate(LocalDate.now());
		
		employee1.setManager(manager1);
		employee2.setManager(manager1);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		
		manager1.setEmployees(employees);
		
		transaction.begin();
	manager.persist(manager);
	manager.persist(employee1);
		manager.persist(employee2);
		transaction.commit();
		System.out.println("All Details Saved!");
	}
		
}

