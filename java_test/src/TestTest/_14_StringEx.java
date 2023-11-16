package TestTest;

import java.util.Scanner;

public class _14_StringEx {

	public static void main(String[] args) {

		String s1 = "홍길동";// 리터럴 테이블에 있던
		String s2 = "홍길동";
		String s3 = new String("홍길동");// 힙메모리에 있던

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));// 걍 이거써라.

		s3 = s3 + "바보";
		s3 = s3.concat(" 바부");// concat은 문자열을 이어붙이는 메서드, 데이터 베이스에서도 문자열 이어붙이는 역할
		System.out.println(s3);

		String s4 = "   Java 프로그래밍      ";

		System.out.println(s4.concat("aa"));
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		System.out.println(s4.trim().toUpperCase() + "Test");
		
		

		String java = "Java";
		String python = "java";

		int a = java.compareTo(python);// 자바가 파이썬보다 사전순으로 먼저나오면 음수 리턴, 
									   // 늦게나오면 양수리턴
		if (a == 0) {
			System.out.println("사전적으로 순서 같음");
		} else if (a < 0) {
			System.out.println(java + " < " + python);
		} else
			System.out.println(java + " > " + python);
		
		Scanner s = new Scanner(System.in);
		
//		String t1 = s.next().toUpperCase();
//		String t2 = s.next().toUpperCase();
//		
//		int d = t1.compareTo(t2);
//
//		
//		if (d == 0) {
//			System.out.println("사전적으로 순서 같음");
//		} else if (d < 0) {
//			System.out.println(t1 + " < " + t2);
//		} else
//			System.out.println(t1 + " > " + t2);
//		
//		String x = s.nextLine();//띄어쓰기 있어도 하나의 문자열로 인식 
//		String y = s.nextLine();
//		
//		System.out.println(x);
//		System.out.println(y);
		
		String s8 = "\t test   \n";
		String s7 = "    test   ";
			
		System.out.print(s8);
		System.out.print(s7);
		System.out.print(s8.trim());
		System.out.print(s7.trim());//\t,\n으로생긴 공백도 다제거
		
		

	}
}
