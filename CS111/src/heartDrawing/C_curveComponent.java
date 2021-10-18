package heartDrawing;

import java.awt.Graphics;
import javax.swing.JComponent;

public class C_curveComponent extends JComponent {
	private Fractal fractal;
	
	private int level;
	private int x1, y1, x2, y2;

	public C_curveComponent() {
		level = 2;
		fractal = new Fractal();
	}
	public void setXY(int _x1, int _y1, int _x2, int _y2) {
		x1 = _x1;
		y1 = _y1;
		x2 = _x2;
		y2 = _y2;
	}
	public void createCcurve(int _level) {
		level = _level;
		
		repaint();
	}

	public void paintComponent(Graphics g) {
		System.out.println("x1 = " + x1 + " y1 = " + y1);
		System.out.println("x2 = " + x2 + " y2 = " + y2);
		
        fractal.drawCCurve(g, x1, y1, x2, y2, level);
	}
}