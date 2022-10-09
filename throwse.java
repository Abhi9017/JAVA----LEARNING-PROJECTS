class throwse{
	static void add() throws  ArithmeticException{
		int x=10;
		int y=0;
		int c=x/y;
		 System.out.println("Insiaaaaade fun(). ");
	}
	public static void main(String args[]){
		try{
			add();
		}
		catch(ArithmeticException e){
			 System.out.println("Insj hide fun(). ");
		}
	}
}
//run try block also catch block use throws