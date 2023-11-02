package q4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class MyOwnComparator implements Comparator<Employee>{
	public MyOwnComparator() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		int diff =(int) (o1.getSalary() - o2.getSalary());
		return -diff;
	}
}

public class Tester {
	public static void main(String[] args) {
		Queue<Employee> q = new PriorityQueue<Employee>(new MyOwnComparator());
		Employee e1 = new Employee(1,"Chetan",2500);
		
		q.offer(e1);
		q.offer(new Employee(2,"Rahul",1000));
		q.offer(new Employee(3,  "Pradeep",5000));
		q.offer(new Employee(3,  "Pradeep",500));
		q.offer(new Employee(3,  "Pdeep",4000));

//		Iterator<Employee> iter = q.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		while(!q.isEmpty()) {
			Employee ele = q.poll();
			System.out.println("Popped: " + ele);
		}
		
	}
}
