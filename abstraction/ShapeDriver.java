package abstraction;

public class ShapeDriver {
	public static void main(String[] args) {
		Shape s = new Circle();
		Shape r = new Rectangle();
		s.display();
		r.display();
	}
}
