
public class JejeError {
	private int line;
	private int charPositionInLine;
	private String msg;
	
	
	public JejeError(){
		int line;
		int charPositionInLine;
		String msg;
	}
	
	public JejeError(int line, int charPositionInLine, String msg){
		line = this.line;
		charPositionInLine = this.charPositionInLine;
		msg = this.msg;
	}
	
	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getCharPositionInLine() {
		return charPositionInLine;
	}

	public void setCharPositionInLine(int charPositionInLine) {
		this.charPositionInLine = charPositionInLine;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
