import java.util.ArrayList;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;


public class JejeErrorListener extends BaseErrorListener{
	public ArrayList<JejeError> JejeError = new ArrayList<>();
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer,
			Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		// TODO Auto-generated method stub
		super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
		//System.err.println("Syntax Error at Line: " +line + " " + msg);
		JejeError JejsError = new JejeError();
		JejsError.setLine(line);
		JejsError.setMsg(msg);
		if(JejsError.getMsg().contains("extraneous input")){
			String[] temp = msg.split("extraneous input");
			String temp2 = temp[1];
			String[] templast = temp2.split("expecting");
			System.err.println("Syntax Error: *Extraneous Input* at line:" + line + " Remove Expression " + templast[0]);
		}
		else if(JejsError.getMsg().contains("no viable alternative")){
			String[] temp = msg.split("no viable alternative at input");
			System.err.println("Syntax Error: *No Viable Alternative* at line:" +line + " Could Not Recognize Token" +temp[1]);
			
		}
		else if(JejsError.getMsg().contains("mismatched input")){
			System.err.println("Syntax Error: *Mismatched Input at line: " +line + msg);
		}
		else if(JejsError.getMsg().contains("missing tokens")){
			System.err.println("Syntax Error: *Missing Token(s)* at line:" +line);
		}
		else if(JejsError.getMsg().contains("token recognition")){
			System.err.println("Syntax Error: *Token Recognition* at line:" +line);
		}
		
	}
}
