package LearnInheritance;

public class Food extends Dinner {

	
	public static void main (String[]args) {
	        
		dinnertime();
		dinneritem("Fish");
		dinneritem("Chicken");
	    lunchtime();
	    snacks();
	    
	    Fruit.snacks();
	    
	    
	    //Fruit frObj = new Fruit();
	    // frObj.snacks();
	
	    
	    Fruit myObj = new Fruit();
	    System.out.println(myObj.fruititem);
	    System.out.println(myObj.fruititem1);
	    System.out.println(myObj.fruititem3);
	    
	    
	    
	    
	}
	   
	 //3 different methods to add Fruit.java class in Food class
	         // 1) extends Fruit class in Lunch class
	         // 2) Fruit.snacks();
	         // 3) Need to make object
	    
	     // snacks();
	    //Fruit.snacks();
	
         // Fruit frObj = new Fruit(); 
	     //frObj.snacks();


	    
	    public static  void dinneritem(String item) {
			  
			   System.out.println("Dinner food : " + item);
		  }
	    
	    
	    public static  void dinneritem(String item, String item2) {
			  
			   System.out.println("Dinner food : " + item + " " + item2);  
	    }  
	     
	   
	    
	    
	    
	    
	    

		
	    
	    
	 
   
	    
	}	
		

