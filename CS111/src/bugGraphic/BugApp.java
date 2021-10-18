package bugGraphic;

import java.util.Scanner;

import javax.swing.JFrame;

public class BugApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("It's a bug world");
		
		BugWorld bugWorld = new BugWorld(300, 300);
		frame.setContentPane(bugWorld);
		frame.setVisible(true);
		
		Bug bug = new Bug(25, 25, 50, 40);
		bugWorld.addBug(bug);
		
		Scanner in = new Scanner(System.in);
		for(;;){
			System.out.print("Enter left or right");
			
			String direction = in.next();
			
			bugWorld.moveBug(direction);
			bugWorld.repaint();
		}		
	}
}