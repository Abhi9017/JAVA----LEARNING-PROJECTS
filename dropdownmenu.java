import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class dropdownmenu extends Applet implements ItemListener{
	    Choice os,browser;
		String msg="";
		public void init(){
			os = new Choice();
			browser = new Choice();
			os.add("Window7");
			os.add("Window8");
			os.add("Window9");
			os.add("Window10");
			browser.add("Internet Explorer");
			browser.add("Microsoft Edge");
			browser.add("Google Chrome");
			browser.add("Brave");
			add(os);
			add(browser);
			os.addItemListener(this);
			browser.addItemListener(this);
		}
		public void ItemStateChanged(ItemEvent ie){
			repaint();
			
		}
		public void paint(Graphics g){
			msg="selected os:";
			msg+=os.getSelectedItem();
			msg="selected browser:";
			msg+=browser.getSelectedItem();
			g.drawString(msg,6,80);
		}
		 
}