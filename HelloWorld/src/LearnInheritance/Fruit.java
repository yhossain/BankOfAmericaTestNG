package LearnInheritance;

public class Fruit   { 
          
	   String fruititem = "Apple";            //default
	   public String fruititem1 = "Orange";    // public
	   private String fruititem2 = "Grapes";     //private
	   protected String fruititem3 = "Mango";
	   
	   
	   
	  public static void snacks() {
		  Fruit myObj = new Fruit();
		  // System.out.println("Fruit time !!" + myObj.fruititem);
		  // System.out.println("Fruit time !!" + myObj.fruititem2);
		  
	  }
		  public static void main(String[] args) {
			  Fruit myObj = new Fruit();
			   System.out.println("Fruit time !!" + myObj.fruititem);
			   System.out.println("Fruit time !!" + myObj.fruititem1);
			  
			  
			 // Fruit myObj2 = new Fruit();
		      System.out.println("Fruit time !!" + myObj.fruititem2);
		      System.out.println("Fruit time !!" + myObj.fruititem3);
		   
		  
		   
	  }
	
	
	
	
	
	
	
	
}   
