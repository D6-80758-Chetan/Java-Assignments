package q1;
import q1.*;
import java.util.Scanner;




public class Tester {

	public static int menu(Scanner sc) {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. BOOK");
		System.out.println("3. DISPLAY");
		System.out.println("4. BILL");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int index = 0;
		double totalBill = 0;
		
		Shop[] s = new Shop[5];
		
		while((choice=menu(sc)) != 0) {
			switch(choice) {
			case 1:
				
				if(index < 5) {
					s[index] = new Book();
					s[index].accept(sc);
					index++;
				}
				break;
			case 3:
				for(Shop p: s) {
					if(p!=null) {
						
						System.out.println(p.toString());
					}
				}
				break;
			case 4:
				for(Shop p: s) {
					if(p!=null) {
//						Book b = (Book) p;
						p.calcPrice();
						
						totalBill += p.getPrice();
					}
				}
				System.out.println("Total:"+totalBill);
				break;
				
				
			default:
				System.out.println("Wrong Choice!!");
				
				
			}
			
		}

		
	}
}
