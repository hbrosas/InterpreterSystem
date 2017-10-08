package gui;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Workspace extends JPanel {
	public Workspace() {
		init();
	}
	
	public void init() {
		this.setVisible(true);
		this.setBounds(350, 0, 930, 470);
		this.setBackground(Main.DARK);
		this.setBorder(BorderFactory.createLineBorder(Main.DARK_BORDER, 1));
	}
}
