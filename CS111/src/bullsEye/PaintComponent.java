package bullsEye;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class PaintComponent extends JComponent {
	
	public void paintComponent(Graphics g){
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 300, 300);
		
		g.setColor(Color.BLUE);
		g.fillOval(0, 0, 300, 300);
		
		g.setColor(Color.YELLOW);
		g.fillOval(30, 30, 240, 240);
		
		g.setColor(Color.BLUE);
		g.fillOval(60, 60, 180, 180);
		
		g.setColor(Color.YELLOW);
		g.fillOval(90, 90, 120, 120);
		
		g.setColor(Color.BLUE);
		g.fillOval(120, 120, 60, 60);
	}
}