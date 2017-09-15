package main;
import java.util.logging.Logger;

import gui.Main;

public class Engine {
	public final static Logger LOGGER = Logger.getLogger("I-System");
	
	public static void main(String[] args) {
		Main main = new Main();
		LOGGER.info("Instantiate MAIN");
		main.run();
	}

}
