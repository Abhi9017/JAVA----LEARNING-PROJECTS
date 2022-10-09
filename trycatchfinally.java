class trycatchfinally{
	public static void main(String args[]){
		
		try{
			int arr[]={1,2,3};
			System.out.println(arr[10]);
		}
		catch(Exception e){
			System.out.println("EXCEPTION RAISED");
		}
		finally{
			System.out.println("Finally block excuted");
		}
	}
}