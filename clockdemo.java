import  javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.Timer;
import java.util.Calendar;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clockdemo extends JFrame{
     JTextField timefield;
    public void clockdemo(){
		
	     timefield = new JTextField();
		 timefield.setEditable(false);
		 timefield.setFont(new Font("Tahoma",Font.PLAIN,40));
		 add(timefield);
		 Timer t = new Timer(1000,new ClockListener());
		 t.start(); 
	 
	 }
	 class ClockListener implements ActionListener {
	   public void  actionPerformed(ActionEvent e){
	   Calendar cd = Calendar.getInstance();  
	   int h = cd.get(Calendar.HOUR_OF_DAY);
	   int m= cd.get(Calendar.MINUTE);
	   int s = cd.get(Calendar.SECOND);
	   timefield.setText(""+h+":"+m+":"+s);
	    
	   }
	  
	 }
	 public static void main(String args[]){
	   clockdemo c = new clockdemo ();
	   c.setSize(200,200);
	   c.setVisible(true);
	 }
}