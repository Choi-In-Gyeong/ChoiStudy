package day0530;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// 2. 5���� ���ڸ� �Է¹޾Ƽ� �迭 �����. ��, Ȧ���� ������
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {
			
			System.out.print("���ڸ� �Է��ϼ���. >>");
			int num = s.nextInt();
			if (num % 2 != 0) {
				a[i] = num;
			} else {
				System.out.println("¦�� �ȵſ�.");
				i--;
			}
		}
		System.out.println("Ȧ���θ� �̷���� �迭 : " + Arrays.toString(a));
		s.close();
	}

}
