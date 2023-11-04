package q3;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		Set<Book> hb = new LinkedHashSet<Book>();
		
		hb.add(new Book("4",5566,"Puneet",9));
		hb.add(new Book("2",21313,"Rahul",3));
		hb.add(new Book("1",987,"chetan",6));
		hb.add(new Book("5",43543,"Satyajeet",5));
		hb.add(new Book("5",3221,"Asatyajeet",5));
		hb.add(new Book("3",5675,"Pradeep",6));
		
		Iterator<Book> iter = hb.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		for(Book b : hb) {
			System.out.println(b);
		}
	}
}
