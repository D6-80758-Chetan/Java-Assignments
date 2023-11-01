package q2;
import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	public int compareTo(Student o2) {
		int diff = - this.getCity().compareTo(o2.getCity());
		if(diff == 0)
			diff = - Double.compare(this.getMarks(), o2.getMarks());
		if(diff == 0)
			diff = this.getName().compareTo(o2.getName());
			return diff;
	}

	
	
}
public class Tester {
	public static void main(String[] args) {
		Student[] e = {
				new Student(1,"Chetan", "Pune", 64.2),
				new Student(2,"Chetan", "Pune", 78.2),
				new Student(4,"Pradeep", "Delhi", 70.45),
				new Student(3,"Rahul", "Jabalpur", 80.22),
		};
		
		Arrays.sort(e);
		for(Student i : e) {
			System.out.println(i);
		}
	}
}
