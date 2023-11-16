package day0530;
//1. 클래스 생성
//-> 변수 3개(int형 2개, double형 1개)
//-> sum 메소드 호출 시 3개의 값을 더해서 리턴
//2. main 메소드에서 객체 생성
//3. 객체에 있는 3개의 변수를 스캐너로 입력 받아서 초기화
//4. sum 메소드 호출

import java.util.Scanner;

public class Sample2 {
	int a;
	int b;
	double c;
	
	double sum(){//()를 자꾸 빼먹음.
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