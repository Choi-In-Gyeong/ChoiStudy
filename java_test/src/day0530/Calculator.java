package day0530;

// Calculator Ŭ���� ����
//1. �ΰ��� ������ �Ű������� �޾Ƽ� ���� ���� �������ִ� multiple �޼ҵ� ����
//2. 3���� ������ �Է¹޾Ƽ� ���� ���� �������ִ� multiple �޼ҵ� ����
//3. 4���� �Ǽ�(double)�� �Է¹޾Ƽ� ���� ū ���� �������ִ� max �޼ҵ� ����

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
