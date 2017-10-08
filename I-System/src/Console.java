
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Console extends JPanel {
	private JPanel titleBar;
	private JTextArea console;
	private JScrollPane scroll;
	private JLabel title;
	
	public Console() {
		init();
	}
	
	public void init() {
		this.setLayout(null);
		this.setVisible(true);
		this.setBounds(350, 470, 930, 250);
		this.setBackground(Main.LIGHT);
		this.setBorder(BorderFactory.createLineBorder(Main.DARK_BORDER, 1));
		
		titleBar = new JPanel();
		titleBar.setLayout(null);
		titleBar.setVisible(true);
		titleBar.setBounds(0, 0, 930, 35);
		titleBar.setBackground(Main.DARK);
		this.add(titleBar);
		
		title = new JLabel("Output/Console");
		title.setVisible(true);
		title.setBounds(10, 0, 100, 35);
		title.setOpaque(false);
		title.setForeground(Main.LIGHT);
		titleBar.add(title);
		
		console = new JTextArea("Hello!");
		console.setTabSize(2);
	    console.setEditable(false);
	    console.setBounds(5, 0, 930, 250);
	    console.setVisible(true);
	    console.setLineWrap(true);
	    console.setForeground(Main.DARK);
	    console.setBackground(Main.LIGHT);
	    console.setBorder(Main.padding);
	    console.setWrapStyleWord(true);
	    console.setCaretColor(Main.DARK);
	     
	    scroll = new JScrollPane(console);
	    console.setBounds(5, 0, 930, 250);
	    scroll.setBorder(null);
	    scroll.setForeground(Main.DARK);
	    scroll.setBackground(Main.LIGHT);
	    this.add(scroll);
	}
}
