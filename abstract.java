abstract class animals{
   public abstract void pig();
   public void elephant(){
   System.out.print("elephant");
   }
}
   class animals2 extends animals{
	  public  void pigy(){
   System.out.print("animalas2");
	   }
   }

class abstract{
  public static void main(String args[]){
             animals2 a= new animals2();
			 a.pigy();
			 a.elephant();
       
   
   }
}