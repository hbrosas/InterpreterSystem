
import java.io.IOException;
import java.util.logging.Logger;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import gui.Main;

public class Engine {
	
	public static void main(String[] args) throws Exception {
		Main main = new Main();
		main.run();
		
//		System.out.println("Antlr4 Example");
//		String input = "1nt x = 0; 1f(x == 0) { x++; } 3ls3 x--;";
//		
//		ANTLRInputStream inputStream = new ANTLRInputStream( input );
//		System.out.println(inputStream.toString());
//		JejeLexer lexer = new JejeLexer(inputStream);
//		CommonTokenStream tokens = new CommonTokenStream(lexer);
//		System.out.println(tokens.getText());
//	
//		for (Token token = lexer.nextToken();
//			     token.getType() != Token.EOF;
//			     token = lexer.nextToken()) {
//			System.out.println(token.getType() + " | " + token.getText());
//		}
	}

}
