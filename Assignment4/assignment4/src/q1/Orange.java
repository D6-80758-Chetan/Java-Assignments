package q1;

public class Orange extends Fruit {

	public Orange(String color, double weight, String name, boolean isFresh) {
		// TODO Auto-generated constructor stub
		super(color, weight, name, isFresh);
	}
	
	
	@Override
	public String toString() {
		return "Orange [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}


	@Override
	String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}
	
}
