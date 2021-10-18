package sunshine;

import javax.swing.JFrame;

public class SunshineApp {
	public static void main(String[] args) {
		JFrame s1 = new JFrame();
		s1.setSize(400, 200);
		
		PaintComponent sunshineCanvas = new PaintComponent();
		s1.add(sunshineCanvas);
		
		s1.setVisible(true);
	}
}