import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class textandlabel extends Applet implements ActionListener{
	TextField name,pass;
	public void init(){
		name=new TextField(12);
		pass=new TextField(8);
		Label n=new Label("NAME");
		Label p=new Label("Password");
		pass.setEchoChar('*');
		add(n);
		add(name);
		
		add(p);
		add(pass);
		
		name.addActionListener(this);
		pass.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		repaint();
	}
	public  void paint(Graphics g){
		   g.drawString("name"+name.getText(),6,60);
		   g.drawString("password"+pass.getText(),6,80);
		   g.drawString("selectedtext"+name.getSelectedText(),6,100);
		   
	}
}