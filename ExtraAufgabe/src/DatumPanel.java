import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

@SuppressWarnings("serial")
public class DatumPanel extends JPanel implements ActionListener{
	
	JLabel label;
	JLabel antwortLabel;
	JTextField textfield;
	Date firstDate = new Date();
	
	public DatumPanel() {
		super();
		
		setLayout(new GridLayout(4,2));
		setBackground(Color.lightGray);
		setBounds(0,0,1200, 800);
		
		label = new JLabel("Gib ein Datum ein");
		add(label);

		textfield = new JTextField("");
		textfield.setPreferredSize( new Dimension( 10, 10 ) );
		add(textfield);

		JButton button = new JButton("Fertig");
		add(button);
		button.addActionListener(this);

		antwortLabel = new JLabel();
		add(antwortLabel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		DatumCheck datum = new DatumCheck();
		datum.setDatum(datum.getDatum());
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		
		try {
			Date date = formatter.parse(String.valueOf(datum));
			
			antwortLabel.setText("ja");
		} catch (ParseException e1) {
			antwortLabel.setText("bitte nicht");
		}
		
	}


}
