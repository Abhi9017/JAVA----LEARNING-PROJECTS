import java.applet.Applet;  
import java.awt.*;  
public class appletbasic extends Applet{
	public void paint(Graphics g){
		g.drawString("abhilash",150,150);
		g.drawRect(10,10,250,10);
		g.fillRect(10,10,250,10);
		g.drawOval(50,50,10,10);
		g.fillOval(50,50,10,10);
		g.drawLine(50,50,10,10);
		g.fillOval(170,200,30,30);  
g.drawArc(90,150,30,30,30,270);  
g.fillArc(270,150,30,30,0,180);  
	}
}     