package heartDrawing;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class C_curveFrame extends JFrame {
	private static final int FRAME_WIDTH = 700;
	private static final int FRAME_HEIGHT = 700;
	private static final int DEFAULT_LEVEL = 2;

	private JLabel levelLabel;
	private JTextField levelField;
	private JButton button;
	private C_curveComponent cCurveDrawComponent;

	public C_curveFrame() {
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);

		createTextField();
		createButton();
		
		cCurveDrawComponent = new C_curveComponent();
		cCurveDrawComponent.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_WIDTH));
		cCurveDrawComponent.createCcurve(DEFAULT_LEVEL);

		JPanel panel = new JPanel();
		panel.add(levelLabel);
		panel.add(levelField);
		panel.add(button);
		panel.add(cCurveDrawComponent);

		this.add(panel);
	}
	private void createTextField() {
		levelLabel = new JLabel("Level: ");
		
		final int FIELD_WIDTH = 10;
		
		levelField = new JTextField(FIELD_WIDTH);
		levelField.setText("" + DEFAULT_LEVEL);
	}

	private void createButton() {
		button = new JButton("Create C-curve");
		ActionListener listener = new AddMyListener();
		
		button.addActionListener(listener);
	}
	class AddMyListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			int level = Integer.parseInt(levelField.getText());

			int x1 = FRAME_WIDTH / 4;
			int y1 = FRAME_HEIGHT / 3;
			int x2 = FRAME_WIDTH - x1;
			int y2 = y1;

			cCurveDrawComponent.setXY(x1, y1, x2, y2);
			cCurveDrawComponent.createCcurve(level);
		}
	}
}