package day0526;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {// ��� �ؾ����� ����ȵɶ��� "���ѷ���" =>Ư������ ������

		Scanner s = new Scanner(System.in);
		int sum = 0;
		
		while (true) {

			System.out.print("���ڸ� �Է��ϼ���. >>");
			
			int i = s.nextInt();

			// if (i<0) {
			// System.out.println("����� �Է��ϼ���~");
			// continue;
			// }
			// sum += i;
			//
			// if (i==0){
			// System.out.println("0�� �Է��ؼ� ������ �����մϴ�.");
			// break;

			if (i < 0) {
				System.out.println("����� �Է��ϼ���~");
			} else if (i == 0) {
				System.out.println("0�� �Է��ؼ� ������ �����մϴ�.");
				break;
			} else {
				sum += i;
			}
		}
		System.out.println("�Էµ� ���ڵ��� ���� " + sum + "�Դϴ�.");
		
	}
}
