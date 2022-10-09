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