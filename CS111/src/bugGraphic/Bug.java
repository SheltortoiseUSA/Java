package bugGraphic;

public class Bug {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Bug(int _x, int _y, int w, int h){
		x = _x;
		y = _y;
		width = w;
		height = h;		
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public void moveLeft(){
		x -= 20;
	}
	public void moveRight(){
		x += 20;
	}
}