//single- level
class a {

	void a1(){
					String color="red";

       System.out.println("a");
	}
}
class b extends a {
						String color ="blue";


	void b1(){

	System.out.println(this.color);
		super.a1();

}
}
// multi-level
class c{
	void c1(){
	System.out.println("c");
}
}
class d extends c{
	void d1(){
		System.out.println("d");

}
}
class e extends d{
	void e1(){
			System.out.println("E");

	}
}
 
 class  inheritance{
	 public static void main(String args[]){
		 e  ee = new e();
		 b bb= new b();
		 bb.a1();
		 bb.b1();
		 ee.c1();
		 ee.d1();
		 ee.e1();
		 
		 
	 }
 }