package gui;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class FileSystem extends JPanel {
	public FileSystem() {
		init();
	}
	
	public void init() {
		this.setVisible(true);
		this.setBounds(75, 0, 275, 720);
		this.setBackground(Main.DARK);
		this.setBorder(BorderFactory.createLineBorder(Main.DARK_BORDER, 1));
	}

}
