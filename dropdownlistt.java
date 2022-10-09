import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class  dropdownlistt extends Applet implements ActionListener {
	   List os,browser;
	   String msg="";
	   public void init(){
		   os=new List(4,true);
		   browser=new List(5,false);
		    os.add("Window7");
			os.add("Window8");
			os.add("Window9");
			os.add("Window10");
			browser.add("Internet Explorer");
			browser.add("Microsoft Edge");
			browser.add("Google Chrome");
			browser.add("Brave");
			browser.add("ownbrowser");
			os.addActionListener(this);
			browser.addActionListener(this);
			add(os);
			add(browser);
	   }
	   public void actionPerformed(ActionEvent ae)
	   {
		   repaint();
	   }
	   public void paint(Graphics g){
		   int idx[];
		   msg="Current Os";
           idx=os.getSelectedIndexes();		   
		   for(int i=0;i<=idx.length;i++){
			   msg+=os.getItem(idx[i])+"";
			   g.drawString(msg,6,60);
			  
		   }
		    msg="current browser";
			   msg+=browser.getSelectedItem();
			   g.drawString(msg,6,80);
	   }
}