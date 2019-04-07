package Practical;

public class DuplicateChar {
	
	// 1) to find the String length method

	public static void main(String[] args) {
		//String str = "Hello Pizza";
		//int lenString = str.length();

		//System.out.println(lenString);
	//}

	
		String str = "Hello Pizza";
		str = str.toLowerCase();
		int lenString = str.length();

		if(lenString > 1 ) {
			
			char[]result = str.toCharArray();
			char[]resultcopy = str.toCharArray();
		
			
		for(int i=0; i<lenString-1; i++) {
		for(int j=1; j<lenString-1; j++) {	
			
		if(result[i] == resultcopy[j]) {
		    System.out.println("Duplicated: " + result[i]);
		}
		//else {
	      //System.out.println("Inside Else");
		//}
		
		//else {
			//System.out.println("no Duplication");
		//}
		}
		}	
	 
	 }
	}
}


