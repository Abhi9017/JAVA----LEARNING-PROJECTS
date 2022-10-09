import java.awt.*;
public class guiusingmain extends Frame{  //inhertance using gui
	guiusingmain(){
		Button b = new Button("Abhilashchinnala");
		b.setBounds(30,100,40,50);
		setSize(300,300); //frame or html size
		add(b);
		setVisible(true);
	}
	public static void main(String args[]){
		guiusingmain g = new guiusingmain();
	}
}

