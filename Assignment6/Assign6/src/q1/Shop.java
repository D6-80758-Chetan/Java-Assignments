package q1;
import java.util.Scanner;


abstract public class Shop {
	private String title;
	private double price;
	private double discountPercent = 10;
	
	public Shop() {
		
	}
	
	public Shop(String title, double price) {

		this.title = title;
		this.price = price;
	}

	void accept(Scanner sc) {
		System.out.println("Enter the Title: ");
		this.title = sc.next();
		System.out.println("Enter the Price");
		this.price = sc.nextDouble();
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	};
	abstract void calcPrice();

	@Override
	public String toString() {
		return "Shop [title=" + title + ", price=" + price + ", discountPercent=" + discountPercent + "]";
	}
	
	
	
}
