import java.io.*;
public class keyboardtofile{
	public static void main(String args[]){
		DataInputStream dis =new DataInputStream(System.in);
		FileOutputStream fos =new FileOutputStream("a1.txt");
	    System.out.println("Enter data input stream");	
		char ch ;
        while((ch =(char)dis.read())!="@")
		fos.write(ch);
		fos.close();
	}
}