import java.io.*;
public class copyfiles{
	public static void main(String args[]) throws IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		try{
			in = new FileInputStream("Courses.txt");
			out = new FileOutputStream("traning.txt");
		int c;
		if((c=in.read())!=-1){
			out.write(c);
		}
		}finally{
			if(in != null){
				in.close();
			}
			if(out != null){
			out.close();
			}
			
		}
	}
}