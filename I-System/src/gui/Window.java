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

import main.Engine;

public class Window extends JFrame implements ActionListener {
	private JMenuBar menu;
	private JMenu file, refactor, run;
	private JMenuItem create, open, save, exit; // FILE
	private JMenuItem rename; // REFACTOR
	private JMenuItem runAs, stop, debug; // RUN
	
	public Window (String name) {
		super(name);
		Engine.LOGGER.info("Initializing WINDOW");
		init();
		this.repaint();
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public void init() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();		
		this.setLayout(null);
		this.pack();
		this.setVisible(true);
		this.setSize(screenSize);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menu = new JMenuBar();
		menu.setBackground(Color.WHITE);
		menu.setForeground(Color.BLACK);
		menu.setFont(Main.MAIN_FONT);
		
		file = new JMenu("File");
		create = new JMenuItem("Create");
		create.addActionListener(this);
		open = new JMenuItem("Open");
		open.addActionListener(this);
		save = new JMenuItem("Save");
		save.addActionListener(this);
		exit = new JMenuItem("Exit");
		exit.addActionListener(this);
		file.add(create);
		file.add(open);
		file.add(save);
		file.add(exit);
		
		refactor = new JMenu("Refactor");
		run = new JMenu("Run");
		
		menu.add(file);
		menu.add(refactor);
		menu.add(run);
		
		this.setJMenuBar(menu);
	}
}
