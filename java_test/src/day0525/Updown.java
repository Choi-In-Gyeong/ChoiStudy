package day0525;

import java.util.Random;
import java.util.Scanner;

public class Updown {

	public static void main(String[] args) {
		System.out.println("��ǻ�Ͱ� 1~100 �� ���� ���� �ϳ��� ���մϴ�.");
		System.out.println("�� ���ڸ� �����ּ���.");

		Random r = new Random();
		Scanner s = new Scanner(System.in);

		int a = r.nextInt(100) + 1;
		int i = 0;

		while (true) {
			i++;
			System.out.print("1-100 ���� �Է� : ");
			int b = s.nextInt();

			if (a > b) {
				System.out.println("UP");
			} else if (a < b) {
				System.out.println("DOWN");
			} else if (a == b) {
				System.out.println("�����Դϴ�. " + i + "�� ���� ������ϴ�.");
				break;
			}
		}
	}
}
