package q1;

import java.util.Scanner;
import q1.*;

class Value{
	String color;
	double weight;
	String name;
}

public class Tester {
	
	public static Value accept(Scanner sc, String fruit) {
		Value v = new Value();
		System.out.println(String.format("Enter the Name of %s",fruit));
		v.name = sc.next();
		
		System.out.println("Enter the weight");
		v.weight = sc.nextDouble();
		System.out.println("Enter the color");
		v.color = sc.next();
		
		return v;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the bucket");
		int size;
		size = sc.nextInt();
		Fruit[] bucket = new Fruit[size];
		int counter = 0;
		int choice;
		
		String name, color;
		double weight;
		Value v;
		
		while((choice = menu(sc)) != 0) {
			
			switch(choice) {
				case 1: 
					v = accept(sc, "Mango");
					bucket[counter++] = new Mango(v.color, v.weight, v.name, true);
					break;
				
				case 2:
					v = accept(sc, "Orange");
					bucket[counter++] = new Orange(v.color, v.weight, v.name, true); 
					break;
				
				case 3:
					v = accept(sc,"Apple");
					bucket[counter++] = new Apple(v.color, v.weight, v.name, true); 
					break;
				default:
					System.out.println("Wrong Choice!!");
			}
			
		}
		
		for(Fruit b : bucket) {
			System.out.println(b);
		}
		
		
	}
	private static int menu(Scanner sc) {
		// TODO Auto-generated method stub
		
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		
		choice = sc.nextInt();
		return choice;
	}
}
