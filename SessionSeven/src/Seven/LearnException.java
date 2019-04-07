package Seven;

public class LearnException {

	public static void main(String[] args) {
		

		try{
			
			int result = 50/5;
			System.out.println(result);
		}
		
		catch(ArithmeticException e){
			System.out.println("caught an exception");
			
		}
		
		finally {
			System.out.println("Finally, i am here inside the finally block");
		}
		System.out.println("My other stuff");
	}

}
