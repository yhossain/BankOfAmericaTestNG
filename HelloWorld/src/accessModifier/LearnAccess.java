package accessModifier;

import LearnInheritance.Fruit;

public class LearnAccess extends Fruit {

	int a = 10;
	public int b = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;

		LearnAccess abc = new LearnAccess();
		System.out.println(abc.a);
		System.out.println(abc.b);

		// snacks();

	}

}
