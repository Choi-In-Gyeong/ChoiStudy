package day0525;

import java.util.Random;
import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		//
		// System.out.print("���ڸ� �Է��ϼ��� : ");
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

		// Random�̶�� Ŭ����, Math.random

		Random r = new Random();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("���� ���� �Է��ϼ���.");
			int val = s.nextInt();
			for (int i = 1; i <= val; i++) {
				System.out.println(i + "�� ����");
				System.out.println();

				int a = r.nextInt(8) + 2;// 2 ~ 9 => ������
				int b = r.nextInt(9) + 1;// 1 ~ 9

				System.out.println(a + " X " + b + " = ");
				if (s.nextInt() == a * b) {
					System.out.println("����");
				} else {
					System.out.println("����. ������ " + a * b + "�Դϴ�");
				}
				System.out.println();
			}
			System.out.println("����Ͻðڽ��ϱ�? �ƹ����ڸ� ������ ���. 0�� ������ ����.");

			int exit = s.nextInt();//���ڸ� �ϳ� �Է¹ް�...
			if (exit == 0) {
				break;
			}
		}
	}
}
