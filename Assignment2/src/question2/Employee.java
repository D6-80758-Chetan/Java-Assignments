package question2;

public class Employee {
	private String firstName;
	private String lastName;
	private double monSalary;
	
	static int hike = 10;
	
	public Employee(String firstName, String lastName, double monSalary) {
		// TODO Auto-generated constructor stub
		if(monSalary > 0) {
			this.monSalary = monSalary ;
		}
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
//	 Employee.applyRaise(1.10);
	
//	static void applyRaise(Employee obj, double raisePercent) {
//		obj.setMonSalary(obj.getMonSalary() * raisePercent);
//	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getMonSalary() {
		return monSalary;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName1(String lastName) {
		this.lastName = lastName;
	}
	public void setMonSalary(double monSalary) {
		if(monSalary > 0) {
			this.monSalary = monSalary;
		}
	}
	
	public static void main(String arg[]) {
		Employee emp1,emp2;
		emp1 = new Employee("a","b",1000);
//		emp1.setMonSalary(emp1.getMonSalary()*Employee.hike);
//		System.out.println("emp1"+ emp1.getMonSalary());
//		EM
		Employee.applyRaise(1.10);
		emp2 = new Employee("c","d",2000);
	}
	
}
