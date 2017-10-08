package gui;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel {
	private JLabel logo, newFile, open, save, settings, run, build;
	
	public Menu() {
		init();
	}
	
	public void init() {
		this.setVisible(true);
		this.setBounds(0, 0, 100, 720);
		this.setBackground(Main.DARK);
		this.setBorder(BorderFactory.createLineBorder(Main.DARK_BORDER, 1));
		
		newFile = new JLabel();
		newFile.setBackground(Main.DARK);
		newFile.setIcon(getIcon(1));
		newFile.setBorder(Main.padding);
		newFile.setBounds(0, 100, 90, 90);
		this.add(newFile);
	}
	
	public ImageIcon getIcon(int type) {
		ImageIcon newFile = new ImageIcon(this.getClass().getResource("/res/icons/new.png"));
		ImageIcon open = new ImageIcon(this.getClass().getResource("/res/icons/open.png"));
		ImageIcon save = new ImageIcon(this.getClass().getResource("/res/icons/save.png"));
		ImageIcon settings = new ImageIcon(this.getClass().getResource("/res/icons/settings.png"));
		ImageIcon run = new ImageIcon(this.getClass().getResource("/res/icons/run.png"));
		ImageIcon build = new ImageIcon(this.getClass().getResource("/res/icons/build.png"));
		
		switch(type) {
		case 1: return newFile;
		case 2: return open;
		case 3: return save;
		case 4: return settings;
		case 5: return run;
		case 6: return build;
		default: return null;
		}
	}
}
