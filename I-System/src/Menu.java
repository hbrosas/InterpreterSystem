
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.SequentialGroup;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel implements MouseListener {
	private JLabel logo, newFile, open, save, settings, run, build;
	private Workspace ws;
	
	public Menu(Workspace ws) {
		this.ws = ws;
		init();
	}
	
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == run) {
			String input = ws.getCode();
			ANTLRInputStream inputStream = new ANTLRInputStream( input );
			JejeLexer lexer = new JejeLexer(inputStream);
<<<<<<< HEAD
//			CommonTokenStream tokens = new CommonTokenStream(lexer);
//			System.out.println(tokens.getText());
		
			for (Token token = lexer.nextToken();
				     token.getType() != Token.EOF;
				     token = lexer.nextToken()) {	
				System.out.println(token.getType() + " | " + token.getText());
			}
=======
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			JejeParser parser = new JejeParser(tokens);
//			parser.removeErrorListeners();
//			parser.addErrorListener(ErrorListener.INSTANCE);
			ParseTree tree = parser.compilationUnit();
	        System.out.println(tree.toStringTree(parser));
>>>>>>> 3f0b3067b60abb9f9ed4ecfef4ea20984740dd2a
		}
	}
	
	public void init() {
		this.setVisible(true);
		this.setLayout(null);
		this.setBounds(0, 0, 75, 720);
		this.setBackground(Main.DARK);
		this.setBorder(BorderFactory.createLineBorder(Main.DARK_BORDER, 1));
		
		newFile = new JLabel(getIcon(1), JLabel.CENTER);
		newFile.setBackground(Main.DARK);
		newFile.setBorder(Main.padding);
		newFile.setBounds(0, 75, 75, 75);
		this.add(newFile);
		
		open = new JLabel(getIcon(2), JLabel.CENTER);
		open.setBackground(Main.DARK);
		open.setBorder(Main.padding);
		open.setBounds(0, 150, 75, 75);
		this.add(open);
		
		save = new JLabel(getIcon(3), JLabel.CENTER);
		save.setBackground(Main.DARK);
		save.setBorder(Main.padding);
		save.setBounds(0, 225, 75, 75);
		this.add(save);
		
		run = new JLabel(getIcon(5), JLabel.CENTER);
		run.setBackground(Main.DARK);
		run.setBorder(Main.padding);
		run.setBounds(0, 300, 75, 75);
		run.addMouseListener(this);
		this.add(run);
		
		build = new JLabel(getIcon(6), JLabel.CENTER);
		build.setBackground(Main.DARK);
		build.setBorder(Main.padding);
		build.setBounds(0, 375, 75, 75);
		this.add(build);
		
		settings = new JLabel(getIcon(4), JLabel.CENTER);
		settings.setBackground(Main.DARK);
		settings.setBorder(Main.padding);
		settings.setBounds(0, 450, 75, 75);
		this.add(settings);
	}
	
	public ImageIcon getIcon(int type) {
		ImageIcon newFile = new ImageIcon(this.getClass().getResource("/res/icons/new.png"));
		ImageIcon open = new ImageIcon(this.getClass().getResource("/res/icons/open.png"));
		ImageIcon save = new ImageIcon(this.getClass().getResource("/res/icons/save.png"));
		ImageIcon settings = new ImageIcon(this.getClass().getResource("/res/icons/settings.png"));
		ImageIcon run = new ImageIcon(this.getClass().getResource("/res/icons/run.png"));
		ImageIcon build = new ImageIcon(this.getClass().getResource("/res/icons/build.png"));
		
		switch(type) {
		case 1: return newFile;
		case 2: return open;
		case 3: return save;
		case 4: return settings;
		case 5: return run;
		case 6: return build;
		default: return null;
		}
	}
	
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
