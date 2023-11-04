package q8;

public class Clerk implements Emp{
	private double salary;
	
	public Clerk() {
		// TODO Auto-generated constructor stub
	}
	public Clerk(double salary) {
		super();
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return salary;
	}
	
}
