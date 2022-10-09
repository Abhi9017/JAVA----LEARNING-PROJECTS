import java.io.*;
class listingfiles{
	public static void main(String args[]){
		String arr[];
		File file=null;
		try{
			file= new File("D:\\java");
			arr=file.list();
          for(String paths:arr) {
            // prints filename and directory name
            System.out.println(paths);
         }
		}catch (Exception e) {
         // if any error occurs
         e.printStackTrace();
      }
		
	}
}