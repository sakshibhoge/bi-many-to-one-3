package bi_many_to_one3con;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import bi_many_to_one3.Employee;
import bi_many_to_one3.Manager;

public class Delete {
	
public static void  main(String[]args) {
		
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("bi_many_to_one");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		

	Manager manager1 = manager.find(Manager.class, 1);
	
	List<Employee> employees = manager1.getEmployees();
	for(Employee employee : employees) {
		if(employee.getId() == 102) {
			transaction.begin();
			employees.remove(employee);
			manager.remove(employee);
			transaction.commit();
			System.out.println("Employee Deleted!");
		}
}
}}