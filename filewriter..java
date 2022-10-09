import java.io.*;
class filewriter{
	public static void main(String args[]) throws IOException{
		int  arr[] = {1,2,3,4,5,6};
		InputStream in = new FileInputStream("traning.txt");
		outputStream os = new FileOutputStream("traning.txt");
		for(int x=0;x<=arr.length;i++){
			os.write(arr[i]);
		}
		os.close();
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