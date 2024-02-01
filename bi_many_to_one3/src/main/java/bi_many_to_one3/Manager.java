package bi_many_to_one3;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
	public class Manager {
		@Id
		private int id;
		private String name;
		private String managerPosition;
		private String department;
		private double salary;
		private LocalDate hireDate;
		private double performanceRating;
		@OneToMany(mappedBy = "manager")
		private List<Employee> employees;

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

		public String getManagerPosition() {
			return managerPosition;
		}

		public void setManagerPosition(String managerPosition) {
			this.managerPosition = managerPosition;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
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

		public double getPerformanceRating() {
			return performanceRating;
		}

		public void setPerformanceRating(double performanceRating) {
			this.performanceRating = performanceRating;
		}

		public List<Employee> getEmployees() {
			return employees;
		}

		public void setEmployees(List<Employee> employees) {
			this.employees = employees;
		}

		public Manager() {
			super();
		}
}
