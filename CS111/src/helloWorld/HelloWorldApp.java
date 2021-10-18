package helloWorld;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloWorldApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setTitle("Play Hello");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Click Hello: ");
		JButton button = new JButton("Say Hello World");
		
		ActionListener listener = new MyListener();
		
		button.addActionListener(listener);
		
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(button);
		
		frame.add(panel);
		frame.setVisible(true);
	}
}
class MyListener implements ActionListener {
	
	public void actionPerformed(ActionEvent event) {
		System.out.println("Hello World");
	}
}