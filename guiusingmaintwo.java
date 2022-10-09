import java.awt.*;
public class guiusingmaintwo {
	guiusingmaintwo(){
		Frame f=new Frame();
		Button b=new Button("abhilash");
		b.setBounds(30,20,50,50);
		f.add(b);
		f.setSize(300,300);
		f.setVisible(true);
		
	}
	public static void main(String args[]){
		guiusingmaintwo g=new guiusingmaintwo();
	}
}