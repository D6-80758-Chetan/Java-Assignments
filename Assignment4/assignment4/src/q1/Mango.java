package q1;

public class Mango extends Fruit {

	public Mango(String color, double weight, String name, boolean isFresh) {
		// TODO Auto-generated constructor stub
		super(color, weight, name, isFresh);
	}
	
	
	@Override
	public String toString() {
		return "Mango [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}


	@Override
	String taste() {
		// TODO Auto-generated method stub
		return "sweet";
	}

}
