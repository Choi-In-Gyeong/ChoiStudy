package day0530;

public class Q1 {

	public static void main(String[] args) {
//		1. �����ܿ��� 5���� �����ϰ� ���

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 5) {
					continue;
				}
				System.out.println(i + "x" + j + "=" + i*j);
			}
			System.out.println();
		}
	}

}
