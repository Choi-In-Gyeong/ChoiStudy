package day0530;

public class Circle {
	int radius;
	String name;

	Circle() {
		System.out.println("기본 생성자 호출");
	}
	
	Circle(int radius) {
		this.radius = radius;
	}

	Circle(int r, String n) {
		System.out.println("매개변수 생성자 호출");
		radius = r;
		name = n;
	}
	
	int getRadius(){
		return radius;
	}
	
	public static void main(String[] args) {
		Circle s = new Circle();
		Circle s2 = new Circle(10,"최");
	}
}
