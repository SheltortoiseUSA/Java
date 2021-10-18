package heartDrawing;

import java.awt.Graphics;

public class Fractal {

	public void drawCCurve(Graphics g, int x1, int y1, int x2, int y2, int level) {
		if (level == 1) {
			g.drawLine(x1, y1, x2, y2);
		}
		else {
			int xn = (x1 + x2) / 2 + (y1 - y2) / 2;
			int yn = (x2 - x1) / 2 + (y1 + y2) / 2;

			System.out.println("xn = " + xn + " yn = " + yn);
			
			drawCCurve(g, x1, y1, xn, yn, level - 1);
			drawCCurve(g, xn, yn, x2, y2, level - 1);
		}
	}
}