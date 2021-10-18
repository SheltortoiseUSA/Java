package rectangle;

public class TestApp {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(30, 40, 10, 10);
		Rectangle r2 = new Rectangle(40, 20, 50, 20);
		
		System.out.println(r1.getArea());
		System.out.println(r2.getArea());
		
		System.out.println(r1.getPerimeter());
		System.out.println(r2.getPerimeter());
		
		System.out.println(r1.toString());
	}
}