package q1;

import java.util.Scanner;

public class Book extends Shop {
	private int ISBN;
	private String author;
	private String  subject;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int iSBN, String author, String subject) {
		super();
		ISBN = iSBN;
		this.author = author;
		this.subject = subject;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter the ISBN: ");
		this.ISBN = sc.nextInt();
		System.out.println("Enter the Author");
		this.author = sc.next();
		System.out.println("Enter the String");
		this.subject = sc.next();
		
	}


	


	@Override
	public String toString() {
		return super.toString() + "Book [ISBN=" + ISBN + ", author=" + author + ", subject=" + subject + "]";
	}

	public void calcPrice() {
		super.setPrice(super.getPrice() - super.getPrice() * (super.getDiscountPercent()/100.0));
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}

}
