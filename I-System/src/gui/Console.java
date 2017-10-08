package gui;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Console extends JPanel {
	public Console() {
		init();
	}
	
	public void init() {
		this.setVisible(true);
		this.setBounds(350, 470, 930, 250);
		this.setBackground(Main.DARK);
		this.setBorder(BorderFactory.createLineBorder(Main.DARK_BORDER, 1));
	}
}
