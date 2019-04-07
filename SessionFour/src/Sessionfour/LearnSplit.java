package Sessionfour;

public class LearnSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String items = "   apple, orange, pear, grapes,mango ";
		items.split(",");
		
		System.out.println(items.trim());
		
		String[] multiitems = items.split(" ,  ");           //using Array method to split the String
		
		System.out.println(items.split(",")[4]);
		
		
		//trim only work before & end. Example below -
		//String items = "    apple, orange, pear, grapes,   mango ";
		//middle trim you can do ("  ,  ")
		
		
		
		
		
		
	}

}
