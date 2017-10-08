package gui;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.SequentialGroup;
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
		this.setLayout(null);
		this.setBounds(0, 0, 75, 720);
		this.setBackground(Main.DARK);
		this.setBorder(BorderFactory.createLineBorder(Main.DARK_BORDER, 1));
		
		newFile = new JLabel(getIcon(1), JLabel.CENTER);
		newFile.setBackground(Main.DARK);
		newFile.setBorder(Main.padding);
		newFile.setBounds(0, 75, 75, 75);
		this.add(newFile);
		
		open = new JLabel(getIcon(2), JLabel.CENTER);
		open.setBackground(Main.DARK);
		open.setBorder(Main.padding);
		open.setBounds(0, 150, 75, 75);
		this.add(open);
		
		save = new JLabel(getIcon(3), JLabel.CENTER);
		save.setBackground(Main.DARK);
		save.setBorder(Main.padding);
		save.setBounds(0, 225, 75, 75);
		this.add(save);
		
		run = new JLabel(getIcon(5), JLabel.CENTER);
		run.setBackground(Main.DARK);
		run.setBorder(Main.padding);
		run.setBounds(0, 300, 75, 75);
		this.add(run);
		
		build = new JLabel(getIcon(6), JLabel.CENTER);
		build.setBackground(Main.DARK);
		build.setBorder(Main.padding);
		build.setBounds(0, 375, 75, 75);
		this.add(build);
		
		settings = new JLabel(getIcon(4), JLabel.CENTER);
		settings.setBackground(Main.DARK);
		settings.setBorder(Main.padding);
		settings.setBounds(0, 450, 75, 75);
		this.add(settings);
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
