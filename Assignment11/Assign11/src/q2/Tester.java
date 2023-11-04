package q2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		Set<Book> hb = new HashSet<Book>();
		
		hb.add(new Book("81",987,"chetan",6));
		hb.add(new Book("20",21313,"Rahul",3));
		hb.add(new Book("3",5675,"Pradeep",6));
		hb.add(new Book("40",5566,"Praneet",9));
		hb.add(new Book("5",43543,"Satyajeet",5));
		hb.add(new Book("5",3221,"Asatyajet",5));
		
		Iterator<Book> iter = hb.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
