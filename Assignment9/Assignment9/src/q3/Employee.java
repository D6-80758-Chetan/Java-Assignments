package q3;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Employee [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(authorName, isbn, price, quantity);
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
		
		if(this.isbn.equals(other.isbn)) {
			return true;
		}
		return false;
	}
	public void accept(Scanner sc) {
		System.out.println("ISBN: ");
		this.isbn = sc.next();
		System.out.println("Price: ");
		this.price = sc.nextDouble();
		System.out.println("AuthorName: ");
		this.authorName = sc.next();
		System.out.println("Quantity: ");
		this.quantity = sc.nextInt();
	}
}
