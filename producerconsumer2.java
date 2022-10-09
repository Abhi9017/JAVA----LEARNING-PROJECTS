class producerconsumer2{
	public static void main(String args[]) throws Exception{
		producer p = new producer();
		consumer c = new consumer(p);
		Thread t1= new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
		
	}
}
class producer  extends Thread{
	 StringBuffer sb;
	 producer(){
		 sb = new StringBuffer();
		 }
		 public void run(){
		 synchronized(sb){
			  for(int i=0;i<=10;i++){
				  try{
					  sb.append(i);
					  Thread.sleep(100);
					  System.out.println("appending" + i);
				  }catch(Exception e){
					  
				  }
			  }
			 
			 sb.notify();
		 }
		   
}
}
class consumer extends Thread{
	producer prod;
	consumer(producer pr){
		prod = pr;
		
	}
	public void run(){
		synchronized(prod.sb){
			try{
				prod.sb.wait();
//for(int j=0;j<=10;j++){
					  //System.out.println("consuming" + j);
				//}
				
			}catch(Exception e){
				
			}
			System.out.println(prod.sb);
		}
	}
}