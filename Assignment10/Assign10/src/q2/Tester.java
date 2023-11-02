package q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class myownComperator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return  (o1.length() - o2.length());
	}
}

public class Tester {
	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<String>();
		
		lst.add("Rahul");
		lst.add("Chetan");
		lst.add("Pradeep");
		lst.add("tony");
		lst.add("My Name is Chetan");
		
		
		System.out.println(lst);
		
		String maxVal = Collections.max(lst,new myownComperator());
		System.out.println(maxVal);
	}
}
