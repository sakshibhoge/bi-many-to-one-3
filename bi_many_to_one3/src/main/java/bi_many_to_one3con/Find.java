package bi_many_to_one3con;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import bi_many_to_one3.Employee;
import bi_many_to_one3.Manager;

public class Find {
	
public static void  main(String[]args) {
		
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("bi_many_to_one");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
	

	Manager manager2 =manager.find(Manager.class, 1);
	if(manager != null) {
		System.out.println("-----------------------------------");
		System.out.println("Manager Id : "+manager2.getId());
		System.out.println("Manager Name : "+manager2.getName());
		System.out.println("Manager Department : "+manager2.getDepartment());
		System.out.println("Manager Position : "+manager2.getManagerPosition());
		System.out.println("Manager Salary : "+manager2.getSalary());
		System.out.println("Manager Hire Date : "+manager2.getHireDate());
		System.out.println("Manager Performance Rating : "+manager2.getPerformanceRating());
		System.out.println("-----------------------------------");
		for(Employee employee : manager2.getEmployees()) {
			System.out.println("-----------------------------------");
			System.out.println("Employee Id : "+employee.getId());
			System.out.println("Employee Name : "+employee.getName());
			System.out.println("Employee Position : "+employee.getPostion());
			System.out.println("Employee Salary : "+employee.getSalary());
			System.out.println("Employee Department : "+employee.getDepartment());
			System.out.println("Employee Hire Date : "+employee.getHireDate());
		}
}
}}