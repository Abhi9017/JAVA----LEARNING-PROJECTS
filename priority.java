class priority extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getPriority());

	}
	public static void main(String args[]){
		priority p = new priority();
		Thread t1=new Thread(p);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
	}
}