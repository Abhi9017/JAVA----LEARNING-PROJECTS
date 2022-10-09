import  java.io.*;
class one extends Thread{
	public void run(){
		try{
			for(int i=0;i<200;i++){
				System.out.println("Good maornung");
								Thread.sleep(1000);

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
				Thread.sleep(2000);
			}
		}catch(Exception e){
				System.out.println("raised");
		}
	}
}
class three extends Thread{
	public void run(){
		try{
			for(int i=0;i<200;i++){
				System.out.println("Welcome");
								Thread.sleep(3000);

			}
		}catch(Exception e){
				System.out.println("raised");
		}
	}
}
class sleepp{
	public static void main(String args[]){
		one o=new one();
		Thread t1=new Thread(o);
		two tw=new two();
		Thread t2=new Thread(tw);
		three th=new three();
		Thread t3=new Thread(th);
		t1.start();
		t2.start();
		t3.start();
	}
}