package day0526;

public class Practice1 {

	public static void main(String[] args) {

		for (int i = 3; i <= 9; i += 3) {// +=3 or i++�ϰ� if�� 3���� ���� ������ 0�� ��
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i * j);

			}

			System.out.println();// 3�� ���������.
		}
	}
}
