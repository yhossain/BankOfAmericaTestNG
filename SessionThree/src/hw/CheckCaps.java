package hw;

public class CheckCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String abc = "Hello, This is Yasmin.  How are you.  Let's go out for dinner.";
		String[] sentences = abc.split("\\.  ");
		
		
		for(String i : sentences){
			System.out.println(i);
			
		// this method to spilt the sentences.	
		// when we are using special character like . stop sign or $ sign,we need to use \\ 
		// after .   space means spilt the word
			
			
			System.out.println(i.charAt(0));
			
			
		//to get the first or any character in string.
			
			char firstletter = i.charAt(0);
			boolean isUpper = Character.isUpperCase(firstletter);
			System.out.println(isUpper);
			
		}
		
	// boolean uppercase to get true or false answer.
	
		
		
		char yas = 'A';
		System.out.println(Character.isUpperCase(yas));
		
		//when you are using character in java, use single ''qotation.
		
		
		
		
		
		
	}

}
