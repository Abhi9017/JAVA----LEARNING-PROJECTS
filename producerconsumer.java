import java.io.*;
import java.util.*;
class producer extends Thread{
	
	public void run(){
		      int i=0;
			  while(i<=5){
				 
			System.out.println("consumer consumed:"+ i);
			this.notifyAll();
			i++;
			  
			  }
	}
	
}

class producerconsumer{
	public static void main(String args[]) throws InterruptedException{
		producer p =new producer();
		Thread t1=new Thread(p);
		t1.start();
		synchronized(t1){
			
		
			int j=0;
			while(j<=5){
				
				System.out.println("producer produced:"+ j);
			   t1.wait();
			   j++;
			
			
		}
		
		
	}
}
}