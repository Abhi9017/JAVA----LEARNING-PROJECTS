interface one{
	public void onemethod();
}
interface two{
	public void twomethod();
}
class demo implements one,two{
	public void onemethod(){
		System.out.println("abhilash  chinnala");
	}
	public void twomethod(){
		System.out.println("abhilash ");
	}
}
class implementsjv{
	public static void main(String args[]){
		demo d = new demo();
		d.onemethod();
		d.twomethod();
	}
}