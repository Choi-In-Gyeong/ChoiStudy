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
				System.out.println(i + "�� ����");
				System.out.println();

				int a = r.nextInt(8) + 2;// 2 ~ 9 => ������
				int b = r.nextInt(9) + 1;// 1 ~ 9
				


				System.out.println(a + " X " + b + " = ");
				if (s.nextInt() == a * b) {
					System.out.println("�����Դϴ�.");
				} else {
					System.out.println("����. ������ " + a * b + "�Դϴ�");
					incor++;
				}
				System.out.println();
			}
			System.out.println("�� " +(100 - incor*20) + "���Դϴ�.");
			break;
		}

		s.close();

	}
}
