package HelloWorld;

import java.util.Scanner;

public class IfandElse {

	public static void main(String[] args) {
		
		// equal ignore case

		
		int age =21;
		
		String name1 = "John";
		String name2 = "johN";
		
		if(name1.equalsIgnoreCase(name2)) {
			
			System.out.println("you are the same person");
		}
		
	//
		if(age==25){
	
		System.out.println("you are not old enough");}
		
		
		
		System.out.println("this is after the if condition");
		
		//
		
		int a = 90;
		String grade ="A";
		
		if (a < 65) {
			
		System.out.println("Fail");}
		
		else {
			
	    System.out.println("Pass");}
		
		
		// if user give me the grade use scanner methods.
		
		Scanner numberInput = new Scanner (System.in);
		
		System.out.println("What is your grade?");
		int b = numberInput.nextInt();
		
		 
		if (b<65) {
			
			System.out.println("Fail");}
			
	    else{
			
			System.out.println("Pass");}
		
		
		
		if (b > 90);{
			
			System.out.println("A");}
	
		 if (b > 80);{
			
			System.out.println("B");}
	
		  if (b > 70);{
			
			System.out.println("C");}
			
		 {
			
			System.out.println("Fail");}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
