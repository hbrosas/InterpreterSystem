
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Workspace extends JPanel {
	private JPanel titleBar;
	private JTextArea console;
	private JScrollPane scroll;
	private JLabel title;
	
	public Workspace() {
		init();
	}
	
	public String getCode() {
		return console.getText();
	}
	
	public void init() {
		this.setVisible(true);
		this.setLayout(null);
		this.setBounds(350, 0, 930, 470);
		this.setBackground(Main.LIGHT);
		this.setBorder(BorderFactory.createLineBorder(Main.DARK_BORDER, 1));
		
		titleBar = new JPanel();
		titleBar.setLayout(null);
		titleBar.setVisible(true);
		titleBar.setBounds(0, 0, 930, 35);
		titleBar.setBackground(Main.DARK);
		this.add(titleBar);
		
		title = new JLabel("Sample.j3j3");
		title.setVisible(true);
		title.setBounds(10, 0, 920, 35);
		title.setOpaque(false);
		title.setForeground(Main.LIGHT);
		titleBar.add(title);
		
		console = new JTextArea();
		console.setTabSize(2);
	    console.setEditable(true);
	    console.setBounds(10, 35, 920, 460);
	    console.setVisible(true);
	    console.setLineWrap(true);
	    console.setForeground(Main.DARK);
	    console.setBackground(Main.LIGHT);
	    console.setBorder(Main.padding);
	    console.setWrapStyleWord(true);
	    console.setCaretColor(Main.DARK);
	     
	    scroll = new JScrollPane(console);
	    scroll.setBounds(5, 35, 920, 460);
	    scroll.setBorder(null);
	    scroll.setForeground(Main.DARK);
	    scroll.setBackground(Main.LIGHT);
	    this.add(scroll);
	    
	    this.repaint();
	}
}
