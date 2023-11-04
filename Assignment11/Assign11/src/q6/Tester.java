package q6;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//class descPrice implements Comparator<Book>{
//	@Override
//	public int compare(Book o1, Book o2) {
//		// TODO Auto-generated method stub
//		return -Double.compare(o1.getPrice(), o2.getPrice());
//	}
//}

public class Tester {
	public static void main(String[] args) {
		Map<String, Book> map = new HashMap<String, Book>();
		int choice;
		while ((choice = menu(new Scanner(System.in)))!=0) {
			switch (choice) {
			case 1:
				Book b = new Book();
				b.accept(new Scanner(System.in));
				map.put(b.getIsbn(), b);
				
				break;
			case 2:
				System.out.println(map);
				break;
				
				
			case 3:
				System.out.println("Enter ISBN: ");
				Book f = map.get(new Scanner(System.in).next());
				f.display();
			default:
				break;
			}
		}
	}

	private static int menu(Scanner sc) {
		
		System.out.println("1. Insert");
		System.out.println("2. Print");
		System.out.println("3. Find");
		System.out.println("Enter the choice: ");
		
		return sc.nextInt();
	}
}
