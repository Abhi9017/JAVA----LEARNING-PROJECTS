import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class radiobutton extends Applet implements ItemListener{
	CheckboxGroup cbg;
	String msg="";
	Checkbox inter,btech,classs;
	public void init(){
		inter = new Checkbox("inter",cbg,true);
		btech = new Checkbox("btech",cbg,false);
		classs = new Checkbox("class",cbg,false);
		add(inter);
		add(btech);
		add(classs);
		inter.addItemListener(this);
		btech.addItemListener(this);
		classs.addItemListener(this);
     }
	 public void itemStateChanged(ItemEvent ie){
		    repaint();
	 }
	 public void paint(Graphics g){
		 msg="Current selection";
		 msg+=cbg.getSelectedCheckbox().getLabel();
		 g.drawString(msg,6,10);
	 }
}