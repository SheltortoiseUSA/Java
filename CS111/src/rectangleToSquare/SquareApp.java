package rectangleToSquare;

public class SquareApp {

	public static void main(String[] args) {
		Square s1 = new Square(30, 10, 10);
		Square s2 = new Square(40, 50, 20);
		
		System.out.println("Area: " + s1.getArea());
		System.out.println("Area: " + s2.getArea());
		
		System.out.println("Perimeter: " + s1.getPerimeter());
		System.out.println("Perimeter: " + s2.getPerimeter());
	}
}