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
	public void mouseEntered(MouseEvent me){
		mousex=0;
		mousey=10;
		msg="mouse entered";
		repaint();
	}
	public void mouseExited(MouseEvent me){
		mousex=0;
		mousey=10;
		msg="mouseexited";
		repaint();
	}
	public void mouseReleased(MouseEvent me){
		mousex=me.getX();
		mousey=me.getY();
		msg="mousereleads";
		repaint();
	}
	public void mousePressed(MouseEvent me){
		mousex=me.getX();
		mousey=me.getY();
		msg="mouse predssed";
		repaint();
	}
	public void mouseDragged(MouseEvent me){
		mousex=me.getX();
		mousey=me.getY();
		mousey=me.getY();
		msg="drgaed";
		repaint();
	}
	public void mouseMoved(MouseEvent me){
		showStatus("moving mouse at" + me.getX()+":"+me.getY());
	}
	
	public void paint(Graphics g){
		g.drawString(msg,mousex,mousey);
	}
	
	
}