abstract class animals{
   public abstract void pigy();
   public void elephant(){
   System.out.println("elephant");
   }
}
   class animals2 extends animals{
	  public  void  pigy(){
   System.out.println("animalas2");
	   }
   }

class abstracts{
  public static void main(String args[]){
             animals2 a= new animals2();
			 a.pigy();
			 a.elephant();
       
   
   }
}