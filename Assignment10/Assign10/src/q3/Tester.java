package q3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tester {
	static int menu(Scanner sc) {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add new Employee");
		System.out.println("2. Delete");
		System.out.println("3. Find");
//		System.out.println("3. DISPLAY");
		System.out.println("4. Edit");		
		
		System.out.println("Enter the Choice: ");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		List<Employee> e = new LinkedList<>();
		
		e.add(new Employee(1,"Chetan",20));
		e.add(new Employee(2,"Rishabh",50));
		e.add(new Employee(3,"Hritik",150));
		e.add(new Employee(4,"Mayank",450));
		e.add(new Employee(5,"Rahul",100));
		Scanner sc = new Scanner(System.in);
		int found;
		int choice;
		while ((choice=menu(sc))!=0) {
			switch (choice) {
			case 1:
				Employee temp = new Employee();
				temp.accept(sc);
				e.add(temp);
				break;
			case 2:
				System.out.println("Enter the Employee Id to be Deleted");
				found = e.indexOf(new Employee(sc.nextInt(),null, 0));
				if(found == -1) {
					System.out.println("Employee Not Found...");
				}
				else {
					e.remove(found);
					System.out.println("Employee Removed ...");
				}
				
				break;
			case 3:
				System.out.println("Enter the Employee Id");
				found = e.indexOf(new Employee(sc.nextInt(),null, 0));
				if(found == -1) {
					System.out.println("Not Found");
				}
				else {
					e.get(found).display();
				}
				break;
			case 4:
				System.out.println("Enter emp id to be modified: ");
				found = e.indexOf(new Employee(sc.nextInt(),null,0));
				if(found == -1) {
					System.out.println("Employee not Found!!");
				}
				else {
					System.out.println("Employee Found");
					System.out.println(e.get(found));
					System.out.println("Enter new information for the Employee");
					Employee newemp = new Employee();
					newemp.accept(sc);
					e.set(found, newemp);
				}
				break;
			default:
				break;
			}
		}
	}
}
