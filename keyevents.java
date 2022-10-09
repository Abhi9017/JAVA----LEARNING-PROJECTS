import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class keyevents extends Applet implements KeyListener{
	String msg ="";
	int x=10;
	int y=20;
	public void init(){
		addKeyListener(this);
		requestFocus();
		
	}
	public void keyPressed(KeyEvent ke){
	
		showStatus("pressed");
		
	}
        public void keyReleased(KeyEvent ke){
		
		
		showStatus("releadesd");
		
	}
	public void keyTyped(KeyEvent ke){
		msg=msg+ke.getKeyChar();
     	repaint();	
	showStatus("typed");
	}
	public void paint(Graphics g){
		g.drawString(msg,x,y);
	}
}