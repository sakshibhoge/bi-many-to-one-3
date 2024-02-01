package bi_many_to_one3;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
	public class Employee {
		@Id
		private int id;
		private String name;
		private String postion;
		private double salary;
		private LocalDate hireDate;
		private String department;
		
		@ManyToOne
		@JoinColumn(name = "manager_id")
		private Manager manager;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPostion() {
			return postion;
		}

		public void setPostion(String postion) {
			this.postion = postion;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public LocalDate getHireDate() {
			return hireDate;
		}

		public void setHireDate(LocalDate hireDate) {
			this.hireDate = hireDate;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public Manager getManager() {
			return manager;
		}

		public void setManager(Manager manager) {
			this.manager = manager;
		}

		public Employee() {
			super();
		}
}
