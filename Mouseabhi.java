import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class MouseClicked extends Applet implements MouseMotionListener,MouseListener{
	String msg="";
	int mousex=0;
	int mousey=0;
	public void init(){
		setBackground(Color.red);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
    public void mouseClicked(MouseEvent me){
		mousex=0;
		mousey=10;
		msg="mouse clicked";
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg,mousex,mousey);
	}
	
	
}