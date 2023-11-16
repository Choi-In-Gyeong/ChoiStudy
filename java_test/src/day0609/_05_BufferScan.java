package day0609;

import java.util.*;

public class _05_BufferScan {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		System.out.println("숫자출력 :" + a);
		s.nextLine();
		//엔터 치는 순간 버퍼안에 \n 남게됨
		String b = s.next();
		System.out.println("문자출력 :" + b);
	}

}
