import java.awt.*;
import java.applet.*;
public class borderlayout extends Applet{
	public void init(){
		setLayout(new BorderLayout());
		add(new Button("Abhi-N"),"North");
		add(new Button("Abhi-S"),"South");
		add(new Button("Abhi-E"),"East");
		add(new Button("Abhi-W"),"West");
		add(new Button("Abhi-C"),"Center");
	}
}