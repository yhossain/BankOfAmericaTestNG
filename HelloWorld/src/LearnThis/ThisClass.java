package LearnThis;

public class ThisClass {

	static String StudentName = "AP";
    static int Grade;
    static String College;
    
    
    public  void printStudentGrade(int grade, String studentname) {
    	this.Grade =  Grade + 10;
   	 System.out.println(studentname + "  " + this.Grade);
   	 
    }
	
    public int sum (int a, int b) {
    	return this.Grade + a + b;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisClass myObj = new ThisClass();
		myObj.printStudentGrade(10, "AP");
		myObj.sum(5, 6);
		System.out.println(myObj.sum(5, 6));
	}	

	}


