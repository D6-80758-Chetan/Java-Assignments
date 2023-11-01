package q3;

import java.util.Comparator;

public class MyWayofSorting implements Comparator<Employee> {
	public MyWayofSorting() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		int diff = o1.getIsbn().compareTo(o2.getIsbn());
		return diff;
	}
}
