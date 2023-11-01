package q3;

import java.util.Date;

class Generic<T> {
	// Nothing
}

class GenericBox<T> extends Generic {
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
}

public class Tester {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
//		GenericBox<String> s1 = new GenericBox<>();// will not work...
		GenericBox<Integer> i1 = new GenericBox<>();
		i1.set(new Integer(10));
		Integer v1 = i1.get();
		System.out.println(v1);
		
		GenericBox<Date> b3 = new GenericBox<Date>();	
		b3.set(new Date());
		System.out.println(b3.get());
		
		Box<? super Person> b
	}
}
