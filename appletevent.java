import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class appletevent extends  Applet implements ActionListener{
	Button b;
	TextField tf;
	public void init(){
		
		tf = new TextField();
		tf.setBounds(10,20,100,50);
		b=new Button("click");
		b.setBounds(30,50,50,30);
		add(b);
		add(tf);
		b.addActionListener(this);
		setLayout(null);
	}
	public void actionPerformed(ActionEvent e){
		tf.setText("abhilash chinnala");
	}
}
