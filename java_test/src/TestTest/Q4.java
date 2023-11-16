package TestTest;

import java.util.Random;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		int incor = 0;

		while (true) {

			for (int i = 1; i <= 5; i++) {
				System.out.println(i + "번 문제");
				System.out.println();

				int a = r.nextInt(8) + 2;// 2 ~ 9 => 구구단
				int b = r.nextInt(9) + 1;// 1 ~ 9
				


				System.out.println(a + " X " + b + " = ");
				if (s.nextInt() == a * b) {
					System.out.println("정답입니다.");
				} else {
					System.out.println("오답. 정답은 " + a * b + "입니다");
					incor++;
				}
				System.out.println();
			}
			System.out.println("총 " +(100 - incor*20) + "점입니다.");
			break;
		}

		s.close();

	}
}
