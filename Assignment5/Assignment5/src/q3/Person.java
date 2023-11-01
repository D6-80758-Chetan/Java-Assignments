package q3;

public class Person implements Cloneable{
	private String name;
	private double weight;
	private Date date;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, double weight, Date date) {
//		super();
		this.name = name;
		this.weight = weight;
		this.date = date;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Person temp = (Person) super.clone();
		temp.date = (Date) this.date.clone();
		return temp;
	}
		
}
