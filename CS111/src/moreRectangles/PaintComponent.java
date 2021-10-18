package moreRectangles;

import java.awt.Graphics;
import javax.swing.JComponent;

public class PaintComponent extends JComponent {
	
	public void paintComponent(Graphics g) {
		g.fillRect(10, 10, 150, 100);
		g.fillRect(200, 200, 100, 150);		
	}
}