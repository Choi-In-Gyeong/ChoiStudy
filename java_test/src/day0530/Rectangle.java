package day0530;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;//변수 선언
	
	public int getArea(){
		return width * height;//메서드 생성
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//객체생성 =>import호출
		Rectangle r = new Rectangle();//객체생성
		
		System.out.print("너비 입력>> ");
		r.width = s.nextInt();
		System.out.print("높이 입력>> ");
		r.height = s.nextInt();//변수값을 채워줌.
		
		System.out.println("사각형의 면적은 : " + r.getArea());//r.getArea => 메서드 호출
		s.close();

	}

}
