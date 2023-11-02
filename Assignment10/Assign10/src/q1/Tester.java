package q1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class myowncomparator implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return - Double.compare(o1.getPrice(), o2.getPrice());
	}
}
public class Tester {
	static int menu(Scanner sc) {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add new book in List");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn");
//		System.out.println("3. DISPLAY");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Delete a book with given name.");
		System.out.println("7. Sort books by isbn in asc order -- Collections.sort(list).");
		System.out.println("8. Sort books by price in desc order -- Collections.sort(list, comparator)");
		System.out.println("9. Reverse the list -- Collections.reverse(list)");
		
		
		System.out.println("Enter the Choice: ");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Book> b = new ArrayList<>();
		
		int choice;
		Book key;
		String id;
		while((choice = menu(sc))!=0) {
			switch (choice) {
			case 1:
				Book temp = new Book();
				temp.accept(sc);
				int found = b.indexOf(temp);
				if(found == -1) {
					System.out.println("Not Found. element added");
					b.add(temp);
				}
				else {
					System.out.println("Book Found");
//					System.out.println("Enter the Quantity");
//					int q = sc.nextInt();
					Book again = b.get(found);
					again.setQuantity(again.getQuantity() + temp.getQuantity());
					
				}
				break;
			case 2:
				System.out.println("Enter the index");
//				int index = ;
				for(int i = sc.nextInt(); i < b.size(); i++) {
					System.out.println(b.get(i));
				}
//				System.out.println(b);
				break;
			case 3:
				System.out.println("Enter the Isbn no:");
				found = b.indexOf(new Book(sc.next(), 0, null, 0));
				if(found == -1) {
					System.out.println("Element Not Found");
					
				}
				else {
					System.out.println("Element found at: " + found);
					b.get(found).display();
				}
				break;
			case 4:
				System.out.println(b.remove(sc.nextInt()));
			
			break;
			case 5:
				found = b.indexOf(new Book(sc.next(), 0, null, 0));
				if(found == -1) {
					System.out.println("Book Not Found");
				}
				else {
					b.remove(found);
				}
			case 6:
				found = b.indexOf(new Book(null, 0, sc.next(), 0));
				if(found == -1) {
					System.out.println("Book Not Found");
				}
				else {
					b.remove(found);
				}
				break;
			case 7:
				Collections.sort(b);
				
				System.out.println(b);
				break;
			case 8:
			
				Collections.sort(b, new myowncomparator());
				
				System.out.println(b);
				break;
				
			case 9:
				Collections.reverse(b);
				System.out.println(b);
				
			default:
				System.out.println("Wrong choice");
				break;
			}
		}
		
	}
}