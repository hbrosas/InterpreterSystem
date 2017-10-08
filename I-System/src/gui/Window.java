package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Window extends JFrame implements ActionListener {
	private Menu menu;
	private FileSystem fsys;
	private Console console;
	private Workspace ws;
	
	public Window (String name) {
		super(name);
		init();
		this.repaint();
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public void init() {	
		this.setLayout(null);
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
		this.setSize(1280,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menu = new Menu();
		fsys = new FileSystem();
		console = new Console();
		ws = new Workspace();
		
		this.add(menu);
		this.add(fsys);
		this.add(console);
		this.add(ws);
		
		this.repaint();
	}
}
