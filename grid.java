import java.awt.*;
public class grid extends java.applet.Applet{
	public void init(){
		add(new Button("one"));
		add(new Button("two"));
		add(new Button("three"));
		add(new Button("four"));
		add(new Button("five"));
		add(new Button("six"));
		setLayout(new GridLayout(3,2));//3 rows 2 columns 
	}
}