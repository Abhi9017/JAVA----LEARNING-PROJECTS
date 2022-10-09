import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mouseeventt extends Applet implements MouseMotionListener{
	String msg="";
	int mousex=0;
	int mousey=0;
	public void init(){
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