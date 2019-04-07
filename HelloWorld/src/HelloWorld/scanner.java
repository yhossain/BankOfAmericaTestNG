package HelloWorld;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		
		System.out.println("What is your name?");
		Scanner userInput = new Scanner (System.in);
		name = userInput.next();
		System.out.println("Hello, "+ userInput.next());
		
		int age;
		
		System.out.println("How old are you?");
		age = userInput.nextInt();
		System.out.println(age  +  " you are not old enough!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
