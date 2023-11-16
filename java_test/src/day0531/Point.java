package day0531;

public class Point {
	private int x;
	private int y;
	
//	Point (){} //디폴트생성자.
	
	Point (int x, int y) {//객체생성할때 매개변수입력하면, set메소드가 필요가없다.
		this.x = x;
		this.y = y;
	}

	void showPoint () { //매개변수 받는거 없으니 공란.
		System.out.println(("(" + x + "," + y + ")"));
	}
	
	
	
}
