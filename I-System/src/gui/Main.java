package gui;

import java.awt.Font;

import main.Engine;

public class Main {
	public final static Font MAIN_FONT = new Font("Helvetica", Font.PLAIN, 14);
	
	private Window window;
	
	public Main() {
		Engine.LOGGER.info("Initializing MAIN");
	}
	
	public void run() {
		init();
	}
	
	public void init() {
		window = new Window("I-System | Interpreter System");
	}
}
