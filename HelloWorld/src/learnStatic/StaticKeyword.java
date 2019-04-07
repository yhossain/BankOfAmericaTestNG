package learnStatic;

public class StaticKeyword {

	int y=5;
	static int a =10;
	

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	StaticKey2.keyincrease();
		
		StaticKey2 myObj = new StaticKey2();
	//	myObj.keyincrease2();
	
	//	ab();
	//}
		
		public static int ab() {
	         return a =a +1;
	
	    }
	  public int xy() {
	      return y=y+a +1;
	  }
	  
		//static variable i can use in non static & static method.But non 
	    //static variable only use in non static method.
	  	
	  public static void main(String[] args) {
	  
	  StaticKeyword a = new StaticKeyword();
	  StaticKeyword b = new StaticKeyword();
	  StaticKeyword c = new StaticKeyword();
	  StaticKeyword d = new StaticKeyword();
	  
	  }
	  public StaticKeyword() {
		  y = y+1;
		System.out.println(y);  
		  
		  
		  
		  
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}

