import  java.io.*;
class one extends Thread{
	public void run(){
		try{
			for(int i=0;i<200;i++){
				System.out.println("Good maornung");
								

			}
		}catch(Exception e){
				System.out.println("raised");
		}
	}
}
class two extends Thread{
	public void run(){
		try{
			for(int i=0;i<200;i++){
				System.out.println("hello");
				
			}
		}catch(Exception e){
				System.out.println("raised");
		}
	}
}
class joins{
	public static void main(String args[]){
		one o=new one();
		Thread t1=new Thread(o);
		two tw=new two();
Thread t2=new Thread(tw);
t1.start();
t1.join();
t2.start();
}}