package rectangle;

import java.applet.Applet;
import java.awt.Graphics;

public class ShowRectangles extends Applet {
		Rectangle r01;
		Rectangle r02;
		
		public void init() {
			r01 = new Rectangle(20, 50, 10, 10);
			r02 = new Rectangle(50, 20, 100, 150);
				
		}
		public void point(Graphics g) {
			g.drawRect(r01.getX(), r01.getY(), r01.getWidth(), r01.getHeight());
			g.drawRect(r02.getX(), r02.getY(), r02.getWidth(), r02.getHeight());
				
	}
}