import java.io.*;
class filecreation{
	public static void main(String args[]){
		String s = "D:\\java\\program1";
		File f = new File(s);
		f.mkdirs();
	}
}