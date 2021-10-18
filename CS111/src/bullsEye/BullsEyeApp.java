package bullsEye;

import javax.swing.JFrame;

public class BullsEyeApp {
	
	public static void main(String[] args) {
		JFrame b1 = new JFrame();
		b1.setSize(300, 300);
		
		PaintComponent tC1 = new PaintComponent();
		
		b1.add(tC1);
		b1.setVisible(true);
	}
}