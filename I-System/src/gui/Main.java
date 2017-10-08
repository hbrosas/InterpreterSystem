package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class Main {
	public final static Font MAIN_FONT = new Font("Helvetica", Font.PLAIN, 14);
	public final static Border padding = BorderFactory.createEmptyBorder(10, 10, 10, 10);
	
	public final static Color DARK = Color.decode("#424242");
	public final static Color DARK_BORDER = Color.decode("#3a3a3a");
	public final static Color LIGHT = Color.decode("#fafafa");
	
	private Window window;
	
	public Main() {
	}
	
	public void run() {
		init();
	}
	
	public void init() {
		window = new Window("J3J3 | Interpreter System");
	}
}
