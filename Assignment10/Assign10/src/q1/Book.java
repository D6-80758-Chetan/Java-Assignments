package q1;
import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book>{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String isbn, double price, String authorName, int quantity) {
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
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
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
		Book other = (Book) obj;
		
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
	public void display() {
		System.out.println("ISBN: " + this.isbn);
;
		System.out.println("Price: " + this.price);

		System.out.println("AuthorName: " + this.authorName);

		System.out.println("Quantity: " + this.quantity);
		
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		int diff = this.isbn.compareTo(o.isbn);
		return diff;
	}
}