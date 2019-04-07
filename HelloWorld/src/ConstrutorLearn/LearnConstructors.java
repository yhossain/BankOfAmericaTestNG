package ConstrutorLearn;

import AnotherPackage.InsideAnotherPackage;
import AnotherPackage.*;
import Exercise.Abc;

public class LearnConstructors {

	public static void main(String[] args) {
		
		
	        AnotherClass myObj = new AnotherClass();
			myObj.printMe("AP");
			
	
				
			
			InsideAnotherPackage sumObj = new InsideAnotherPackage();
			sumObj.sum(5, 6);
			
			InsideAnotherPackage2 subObj = new InsideAnotherPackage2();
			subObj.subtract(10, 8);
			
			System.out.println(sumObj.sum(5, 6)+ " " + subObj.subtract(10, 8));
			
			sumObj.Hello();
			
			Abc apObj = new Abc();
			apObj.alph();
	}
			//AnotherClass myObj2 = new AnotherClass(10);
			//myObj2.printMe("AP");
			
			
			//AnotherClass myObj3 = new AnotherClass();
			//myObj3.printMe("AP");
			
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


