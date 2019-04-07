package Seven;

public class Throws {

	public static void main(String[] args) {
		
		
		
	
	public int div (int a, int b)throws ArithmaticException{
		
		
		try {
			int result = a/b;
			return result;
		}
		catch (ArithmeticException abc) {
			System.out.println(abc.getMessage());
		}
	}

}
}