package day0530;

public class Circle {
	int radius;
	String name;

	Circle() {
		System.out.println("�⺻ ������ ȣ��");
	}
	
	Circle(int radius) {
		this.radius = radius;
	}

	Circle(int r, String n) {
		System.out.println("�Ű����� ������ ȣ��");
		radius = r;
		name = n;
	}
	
	int getRadius(){
		return radius;
	}
	
	public static void main(String[] args) {
		Circle s = new Circle();
		Circle s2 = new Circle(10,"��");
	}
}
