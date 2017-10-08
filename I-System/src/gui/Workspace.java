package gui;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Workspace extends JPanel {
	private JTextArea console;
	private JScrollPane scroll;
	
	public Workspace() {
		init();
	}
	
	public void init() {
		this.setVisible(true);
		this.setBounds(350, 0, 930, 470);
		this.setBackground(Main.DARK);
		this.setBorder(BorderFactory.createLineBorder(Main.DARK_BORDER, 1));
		
		console = new JTextArea();
	    console.setEditable(true);
	    console.setBounds(5, 5, 915, 460);
	    console.setVisible(true);
	    console.setLineWrap(true);
	    console.setForeground(Main.LIGHT);
	    console.setBackground(Main.DARK);
	    console.setWrapStyleWord(true);
	     
	    scroll = new JScrollPane(console);
	    scroll.setBounds(5, 5, 915, 460);
	    scroll.setForeground(Main.LIGHT);
	    scroll.setBackground(Main.DARK);
	    scroll.setBorder(BorderFactory.createLineBorder(Main.DARK_BORDER));
	    
	    this.add(scroll);
	    this.repaint();
	}
}
