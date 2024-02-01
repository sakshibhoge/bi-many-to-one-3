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

public class AddEmployee {
public static void  main(String[]args) {
		
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("bi_many_to_one");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		

	Manager manager1 = manager.find(Manager.class, 1);
	List<Employee> employees = new ArrayList<>();
	
	Employee employee1 = new Employee();
	employee1.setId(103);
	employee1.setName("prathmedh");
	employee1.setPostion("Back End Developer");
	employee1.setDepartment("IT");
	employee1.setSalary(20000);
	employee1.setHireDate(LocalDate.now());
	employee1.setManager(manager1);
	
	employees.add(employee1);
	
	manager1.setEmployees(employees);
	transaction.begin();
	manager.persist(employee1);
	transaction.commit();
	System.out.println("New Employee Added!");
	
}
}