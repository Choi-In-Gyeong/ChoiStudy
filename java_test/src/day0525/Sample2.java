package day0525;

import java.util.Random;
import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		//
		// System.out.print("숫자를 입력하세요 : ");
		// Scanner s = new Scanner(System.in);
		// int val = s.nextInt();
		// //
		// for (int i = 1; i <= val; i++) {
		// System.out.print(i + " ");
		// }

		// for (int i = val; i < val + 1 ; i++) {
		// for (int j = 1; j <= 9; j++) {
		// System.out.println(i + "X" + j + "=" + i*j );
		//
		// }
		// System.out.println();
		//
		// }
		//
		// for (int i = 1; i <= 9; i++) {
		// System.out.println(val + "X" + i + "=" + val*i );
		//
		// }

		// for (int i = 9; i >= 1; i--) {
		// for (int j = 1; j <= 9; j++) {
		// System.out.println(i + "X" + j + "=" + i*j);
		// }
		// System.out.println();
		// }

		// int a = 0;
		// while (true) {
		// System.out.println(a++);
		// if (a==100) {
		// break;
		// }
		// }

		// Random이라는 클래스, Math.random

		Random r = new Random();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("문제 수를 입력하세요.");
			int val = s.nextInt();
			for (int i = 1; i <= val; i++) {
				System.out.println(i + "번 문제");
				System.out.println();

				int a = r.nextInt(8) + 2;// 2 ~ 9 => 구구단
				int b = r.nextInt(9) + 1;// 1 ~ 9

				System.out.println(a + " X " + b + " = ");
				if (s.nextInt() == a * b) {
					System.out.println("정답");
				} else {
					System.out.println("오답. 정답은 " + a * b + "입니다");
				}
				System.out.println();
			}
			System.out.println("계속하시겠습니까? 아무숫자를 누르면 계속. 0을 누르면 종료.");

			int exit = s.nextInt();//숫자를 하나 입력받고...
			if (exit == 0) {
				break;
			}
		}
	}
}
