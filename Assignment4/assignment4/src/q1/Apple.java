package q1;
import q1.Fruit;

public class Apple extends Fruit{

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	@Override
	String taste() {
		// TODO Auto-generated method stub
		return "sweet n sour";
	}
	
	
	

}
