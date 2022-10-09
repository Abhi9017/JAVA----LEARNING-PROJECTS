import java.io.*;
public class readfileanddisplay{
	public static void main(String  args[])throws IOException{
		FileInputStream fis= new FileInputStream("a1.txt");
		System.out.println("systame reading files");
		int ch;
		while((ch=fis.read())!=-1){
			System.out.println((char)ch);
		}
			fis.close();
		
	}
}