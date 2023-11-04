package q5;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class descPrice implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return -Double.compare(o1.getPrice(), o2.getPrice());
	}
}

public class Tester {
	public static void main(String[] args) {
		TreeSet<Book> hb = new TreeSet<Book>();
		
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
		System.out.println();
		Iterator<Book> iter2=  hb.descendingIterator();
		while(iter2.hasNext()) {
			Book ele = iter2.next();
			System.out.println(ele + ", ");
		}
	}
}
