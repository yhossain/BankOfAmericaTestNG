package Practical;

public class FindDuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "onomonopoeia nomonopoeia" ;
		  
		char[] charArray1 = str.toCharArray();
		char[] charArray2 = str.toCharArray();
		  
		//made two variable to compare the duplicate
		//charArray means take a string make it individual character.
		
		int count = 0;
		
		for ( int i=0 ; i<charArray1.length; i++) {
			for ( int j=0 ; j<charArray2.length; j++) {
		
				//it's call nested loop. e
			
				
		if ( charArray1 [i] == charArray2[j]) {
		   count = count+1 ;
		}
		}
			//if condition to count the value.
			
		System.out.println( charArray1[i] + " : " + count);
		     count = 0;
		
		//everytime i value count need to start from 0. Means when i array 
		 // comparing with j array.Everytime when you done to compare j loop, you need reset count 0. 
		
		}	
	}

}
