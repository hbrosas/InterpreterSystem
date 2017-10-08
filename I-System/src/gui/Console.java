package gui;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Console extends JPanel {
	private JTextArea console;
	private JScrollPane scroll;
	
	public Console() {
		init();
	}
	
	public void init() {
		this.setVisible(true);
		this.setBounds(350, 470, 930, 250);
		this.setBackground(Main.DARK);
		this.setBorder(BorderFactory.createLineBorder(Main.DARK_BORDER, 1));
		
//		console = new JTextArea();
//	    console.setEditable(false);
//	    console.setBounds(10, 10, 920, 240);
//	    console.setVisible(true);
//	    console.setLineWrap(true);
//	    console.setWrapStyleWord(true);
//	     
//	    scroll = new JScrollPane(console);
//	    scroll.setBounds(10, 10, 920, 240);
//	    scroll.setBorder(BorderFactory.createLineBorder(Main.DARK_BORDER));
//	    
//	    this.add(scroll);
	}
}
