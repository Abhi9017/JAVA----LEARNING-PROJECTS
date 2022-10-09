import java.io.*;
public class readconsole{
	public static void main (String args[]) throws IOException{
		InputStreamReader in = null;
		try{
			in = new InputStreamReader(System.in);
			System.out.print("'q' to quit");
			char c ;
			do{
				c=(char) in.read();
				System.out.println(c);
				}while(c!='q');
					
				
		}finally{
			if(in!=null){
				in.close();
			}
		}
	}
}
