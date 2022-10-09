import java.io.*;
class filewriter{
	public static void main(String args[]){
		try{
		int  arr[] = {1,2,3,4,5,6};
		OutputStream os = new FileOutputStream("traning.txt");
		for(int x=0;x<=5;x++){
			os.write(arr[x]);
			
		}
		os.close();
        InputStream in = new FileInputStream("traning.txt");

		int size = in.available();

		for(int i=0;i<=size;i++){
			 System.out.print((char)in.read() + "  ");
		}
		in.close();
	}
	catch (IOException e) {
         System.out.print("Exception");
      }	
	}
}