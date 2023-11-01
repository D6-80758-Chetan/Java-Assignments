package q3;

interface Displayable{
	void display();
}

class Person implements Displayable {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public void display() {
		System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

class Book implements Displayable {
	private String name;
	private double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	// ...
	@Override
	public void display() {
		System.out.printf("Name: %s, Price: %.2f\n", this.name, this.price);
	}
}

class Car {
	private String name;
	private double price;
	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}
	// ...
	public void display() {
		System.out.printf("Name: %s, Price: %.2f\n", this.name, this.price);
	}
}

class Box<T extends Displayable>{
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
	
	public void show() {
//		obj.display();
	}
//	@Override
//	public void display() {
//		// TODO Auto-generated method stub
//		
//	}
}

public class Tester1 {
	public static void main(String[] args) {
		
	}
}
