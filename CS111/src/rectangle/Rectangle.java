package rectangle;

public class Rectangle {
	private int height;
	private int width;
	private int x;
	private int y;
	
	public Rectangle() {
		height = 0;
		width = 0;
		x = 0;
		y = 0;
	}
	public Rectangle(int h, int w, int _x, int _y) {
		height = h;
		width = w;
		x = _x;
		y = _y;
	}
	public int getArea() {
		return width * height;
	}
	public int getPerimeter() {
		return width * 2 + height * 2;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int w) {
		width = w;
	}
	public int getWidth() {
		return width;
	}
	public void setX(int _x) {
		x = _x;
	}
	public int getX() {
		return x;
	}
	public void setY(int _y) {
		y = _y;
	}
	public int getY() {
		return y;
	}
}