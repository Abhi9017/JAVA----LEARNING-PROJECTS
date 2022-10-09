class abhi{
	void p1(){
		System.out.println("p1 method");
	}
}
class abhi2 extends abhi{
	void p1(){
		System.out.println("p2 methd");
	}
}
class runtime {
	public static void main(String args[]){
		abhi a =new abhi();
		abhi2 a2 = new abhi2();
		a.p1();
		a2.p1();
		
	}
}