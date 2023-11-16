package day0526;

public class Circle {
	int radius; // 원의 반지름 필드
	String name; // 원의 이름 필드

	public double getArea() { // 원의 면적 계산 메소드
		return 3.14 * radius * radius;
	}
}
