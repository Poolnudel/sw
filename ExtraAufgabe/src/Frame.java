import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.Rectangle;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Frame extends JFrame {

	public Frame(String title) throws HeadlessException {
		super(title);

		setBounds(10, 10, 1200, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(null);
		Container pane = getContentPane();
		pane.setBackground(Color.GRAY);
		DatumPanel panel = new DatumPanel();
		add(panel);
		setVisible(true);

	}

}
