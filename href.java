import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class href extends Applet  implements ActionListener{
	String msg="";
	Button y,n,d;
	public void init()
	{
		y=new Button("yes");
		n=new Button("no");
		d=new Button("decision");
		y.addActionListener(this);
		n.addActionListener(this);
		d.addActionListener(this);
		add(y);
		add(n);
		add(d);
	}
	public void actionPerformed(ActionEvent ae)
	{
		  String str=ae.getActionCommand();
		  if(str.equals("yes")){
			  msg ="you pressed yes";
			 
			 setBackground(Color.red);
		  }
		   if(str.equals("no")){
			  msg ="you pressed no";
			   setBackground(Color.green);
		  }
		   if(str.equals("decision")){
			  msg ="you pressed decision";
			   setBackground(Color.pink);
		  }
		  repaint();
		
		
	}
	public void paint(Graphics g){
		g.drawString(msg,6,100);
	}
}