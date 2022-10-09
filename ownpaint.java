import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ownpaint extends Applet implements MouseMotionListener{
	int x,y;
	public void init(){
	    addMouseMotionListener(this);
		setBackground(Color.red);
	}
	public void mouseDragged(MouseEvent me){
		Graphics g = getGraphics();
		g.setColor(Color.white);  

		g.fillOval(x,y,10,10);
		 int x =me.getX();
		 int y =me.getY();
		
		 
	}
	public void mouseMoved(MouseEvent me){
  
} 
	
}