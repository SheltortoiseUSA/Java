package bugGraphic;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;

public class BugWorld extends JPanel {
	private Graphics2D offscreen;
	private ArrayList <Bug> bugs;
	
	public BugWorld(int width, int height){
		super();
		
		bugs = new ArrayList <Bug>();

		setPreferredSize(new Dimension(width, height));		
	}
	public void addBug(Bug bug){
		bugs.add(bug);
	}
	public void moveBug(String direction){
		if(direction.toLowerCase().equals("left")) {
			bugs.get(0).moveLeft();
		}
		else if(direction.toLowerCase().equals("right")) {
			bugs.get(0).moveRight();
		}
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int x = bugs.get(0).getX();
		int y = bugs.get(0).getY();
		int width = bugs.get(0).getWidth();
		int height = bugs.get(0).getHeight();
		
		g.drawOval(x, y, width, height);
	}
}