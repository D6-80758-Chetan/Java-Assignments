package q3;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	private int eid;
	private String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	public void accept(Scanner sc) {
		System.out.println("Id: ");
		this.eid = sc.nextInt();
		System.out.println("Name: ");
		this.name = sc.next();
		System.out.println("Salary: ");
		this.salary = sc.nextDouble();
	}
	public void display() {
		System.out.println("Id: " + this.eid);
;
		System.out.println("Name: " + this.name);

		System.out.println("Salary: " + this.salary);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid;
				
	}
	
}
