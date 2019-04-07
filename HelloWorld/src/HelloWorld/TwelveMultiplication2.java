package HelloWorld;

import java.util.Scanner;

public class TwelveMultiplication2 {

	public static void main(String[] args) {
		
		
	// when user give me the length(number)
		
		System.out.println("What multiplication table?");
		
		Scanner userInput = new Scanner (System.in);
		
		       int n;
		       n = userInput.nextInt();
		       
		System.out.println(" ==== Printing table of:"+ n + "========");
		
		
		for (int i=1; i<n+1; i++) {
	    for (int j=1; j<n+1; j++) {
		
	    	System.out.print(i*j + " ");
		}
			System.out.println();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
