package moreRectangles;

import javax.swing.JFrame;

public class RectangleApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setSize(400, 400);
		frame.setTitle("Play Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PaintComponent pComponent = new PaintComponent();
		
		frame.add(pComponent);
		frame.setVisible(true);
	}
}