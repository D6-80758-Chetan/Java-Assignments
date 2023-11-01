package q3;


import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	static int menu(Scanner sc) {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. ADD");
		System.out.println("2. SORT");
		System.out.println("3. DELETE BOOK");
//		System.out.println("3. DISPLAY");
		System.out.println("4. DELETE ALL BOOKS");
		System.out.println("5. NO. OF BOOKS");
		System.out.println("Enter the Choice: ");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> e = new ArrayList<>();
		int choice;
		Employee key;
		String id;
		while((choice = menu(sc))!=0) {
			switch (choice) {
			case 1:
				Employee temp = new Employee();
				temp.accept(sc);
				e.add(temp);
				System.out.println("Book Added...");
				break;
			
			case 2:
				e.sort(new MyWayofSorting());
				System.out.println(e);
				break;
				
			case 3:
				System.out.println("Enter the BOOK id to be deleted");
				id = sc.next();
				key = new Employee();
				key.setIsbn(id);
				if(e.contains(key)) {
					e.remove(key);
					System.out.println("Book Removed");
				}
				else {
					System.out.println("Book Not Found");
				}
				break;
			case 4:
				e.clear();
				break;
			case 5:
				System.out.println(e.size());
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}
		
	}
}
