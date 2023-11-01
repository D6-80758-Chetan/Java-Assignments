


public class Circle extends BoundedShape {
	double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double calcArea() {
		
		return 3.14 * radius * radius;
		
	}
	
}
