package day0530;

public class Main {

	public static void main(String[] args) {

		ClassB b1 = new ClassB();
		b1.candyNum = 10;
		ClassB b2 = new ClassB();
		b2.candyNum = 20;
		
		ClassB.candyNum = 30;
		
		System.out.println(b1.candyNum);
	}

}
