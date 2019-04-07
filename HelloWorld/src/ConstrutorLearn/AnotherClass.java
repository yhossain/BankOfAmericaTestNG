package ConstrutorLearn;

public class AnotherClass {

	public static void printMe (String Name) {
		
		
		System.out.println("My name is " + Name);
	
	}
	     
	 public AnotherClass() {
		 this("abc");
		 System.out.println("I am printing from construtor");
	 }
	
	public AnotherClass(int a) { 
		
	     System.out.println("I am printing int from construtor");
	     
	}
	     public AnotherClass(String a) { 
	    	 this(5);
		     System.out.println("I am printing String from construtor");
		 
	     } 
	     
	     
}

	
	
	
	
	
	
	
	
	
	
	
	
	

