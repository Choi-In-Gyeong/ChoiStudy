package day0530;

// Calculator 클래스 생성
//1. 두개의 정수를 매개변수로 받아서 곱한 값을 리턴해주는 multiple 메소드 생성
//2. 3개의 정수를 입력받아서 곱한 값을 리턴해주는 multiple 메소드 생성
//3. 4개의 실수(double)를 입력받아서 가장 큰 값을 리턴해주는 max 메소드 생성

public class Calculator {

	int mutiple(int a, int b) {
		int x = a * b;
		return x;
	}
	int mutiple(int a, int b, int c) {
		int x = a * b * c;
		return x;
	}
	double max(double a, double b, double c, double d) {
		double x = (a >= b) ? a : b;
		double y = (c >= d) ? c : d;
		return (x >= y) ? x : y;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.mutiple(1, 2));
		System.out.println(c.mutiple(1, 2, 3));
		System.out.println(c.max(2.5, 3.5, 7.5, 4.0));
	}
}
