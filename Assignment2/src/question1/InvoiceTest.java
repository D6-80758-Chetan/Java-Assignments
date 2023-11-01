package question1;
import question1.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		
		Invoice customer1 = new Invoice("1", "Its a good part", 3, 45.34);
		System.out.println(String.format("You bill is %s",customer1.calculateBill()));
		
	}
}
