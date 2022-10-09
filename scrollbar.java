import java.awt.*;
import  java.awt.event.*;
import java.applet.*;
public class scrollbar extends Applet implements MouseMotionListener,AdjustmentListener{
	Scrollbar vertsb,hortsb;
     String msg="";	
	 public void init(){
		
		 vertsb= new Scrollbar(Scrollbar.VERTICAL,0,1,0,300);
		 hortsb=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,400);
		 add(vertsb);
		 add(hortsb);
		 vertsb.addAdjustmentListener(this);
		 hortsb.addAdjustmentListener(this);
		 addMouseMotionListener(this);
		 }
		 public void adjustmentValueChanged(AdjustmentEvent ae){
			 repaint();
		 }
		 public void  mouseDragged(MouseEvent me){
			  int x=me.getX();
			 int y=me.getY();
			 vertsb.setValue(y);
			 hortsb.setValue(x);
			 repaint();
			 
		 }
		 
		 public void mouseMoved(MouseEvent me){
			
			 
		 }
		 public void paint(Graphics g){
			 msg="vertical at:"+vertsb.getValue();
			 msg+="horizantal:"+ hortsb.getValue();
			 g.drawString(msg,6,80);
			 g.drawString("*",hortsb.getValue(),vertsb.getValue());
		 }
}