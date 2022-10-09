import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class textarea2 extends Applet {
    public  void init(){
		String msg="The polling for the presidential \n election began on 15 July\n 2002, in Parliament \n and the state assemblies, with t\nhe media claiming that \nthe election was a one-sided affair and \nKalam's victory was a foregone conclusion; the count \nwas held on 18";
		TextArea t = new TextArea(msg,10,30);
		add(t);
	}	
}