class throwe{
	public static void main(String args[]){
		try{
			throw new  ArithmeticException("demomessge");
			//affter this code not excuted
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}