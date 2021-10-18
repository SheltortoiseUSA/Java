package sunshine;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class PaintComponent extends JComponent {
	public void paintComponent(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, 400, 200);
		
		for(int i = 10; i <= 390; i += 10) {
			g.setColor(Color.yellow);
			g.drawLine(i, 0, 200, 200);
		}
	}
}