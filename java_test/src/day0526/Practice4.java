package day0526;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int arr[] = new int[5];
		int count = 0;

		// while (true) {
		// System.out.print("���ڸ� �Է��ϼ���. ������ ����.");
		// int i = s.nextInt();
		//
		// if (i > 0) {
		// arr[count] = i;
		// count++;
		// } else {
		// System.out.println("����� �Է����ּ���.");
		// }
		//
		// if (count == 5) {
		// System.out.println("�迭�� ���� á���ϴ�. �Է��� �����մϴ�.");
		// break;
		// }
		// }
		for (int i = 0; i < 5; i++) {
			System.out.print("���ڸ� �Է��ϼ���. ������ ����- >> ");

			int num = s.nextInt();
			if (num >= 0) {
				arr[i] = num;
			}else {
				System.out.println("���� �ȵſ�.");
				i--;
			}
		}
		System.out.println("�Էµ� ���ڵ�:");
		System.out.println(Arrays.toString(arr));
		
		s.close();

	}
}
