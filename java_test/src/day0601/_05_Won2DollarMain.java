package day0601;

import java.util.Scanner;

public class _05_Won2DollarMain {

	public static void main(String[] args) {

		_04_Won2Dollar toDollar = new _04_Won2Dollar(1200); // 1�޷��� 1200�� //������
															// ������ϱ� ������ ������ �ִ�
															// ������ �ʿ�.

		Scanner s = new Scanner(System.in);

		System.out.println("���� �޷��� �ٲߴϴ�.");
		System.out.print("���� �Է��ϼ���>>");
		toDollar.won = s.nextInt();

		toDollar.run();

		s.close();

	}

}
