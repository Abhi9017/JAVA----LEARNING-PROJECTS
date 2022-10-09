class shape{
	void add(int a,int b){
	int c = a + b;
 System.out.println(c);	
	}

void add(int a , int b, int c){
int d = a + b+ c;
System.out.println(d);
}
}
class compiletime{
	public static void main (String args[]){
		shape s = new shape();
		s.add(2 ,3);
		s.add(1,2,3);
	}
}