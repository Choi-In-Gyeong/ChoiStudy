package day0530;
//1. Ŭ���� ����
//-> ���� 3��(int�� 2��, double�� 1��)
//-> sum �޼ҵ� ȣ�� �� 3���� ���� ���ؼ� ����
//2. main �޼ҵ忡�� ��ü ����
//3. ��ü�� �ִ� 3���� ������ ��ĳ�ʷ� �Է� �޾Ƽ� �ʱ�ȭ
//4. sum �޼ҵ� ȣ��

import java.util.Scanner;

public class Sample2 {
	int a;
	int b;
	double c;
	
	double sum(){//()�� �ڲ� ������.
		return a + b + c;
	}

	public static void main(String[] args) {
		Sample2 sam = new Sample2();
		Scanner s = new Scanner(System.in);
		
		sam.a = s.nextInt();
		sam.b = s.nextInt();
		sam.c = s.nextDouble();
		
		System.out.println(sam.sum());
		s.close();
	}
}