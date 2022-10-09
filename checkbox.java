import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class checkbox extends Applet implements ItemListener{
	  String msg="";
      Checkbox classs,intermidate,Btech;
          public void init(){
			  classs=new Checkbox("10classes",null,true);
			  intermidate=new Checkbox("inter");
			  Btech= new Checkbox("btech");
			  add(classs);
			  add(intermidate);
			  add(Btech);
			  classs.addItemListener(this);
			  intermidate.addItemListener(this);
			  Btech.addItemListener(this);
		  }	
      public void itemStateChanged(ItemEvent ie){
		  repaint();
	  }
      public void paint(Graphics g){
		  msg="Current state";
		  g.drawString(msg,6,80);
		  msg="10class"+classs.getState();
		   g.drawString(msg,6,100);
		  msg="intermidate"+intermidate.getState();
		   g.drawString(msg,6,120);
		  msg="B.tech"+Btech.getState();
		   g.drawString(msg,6,140);
		  
	  }	  
} 