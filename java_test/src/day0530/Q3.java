package day0530;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		// 3. {5, 3, 10, 2, 9, 8}
		// �������� �����ϱ�. ��, Ȧ������ �����ϰ� ¦�� ����
		// ex) {3, 5, 9, 2, 8, 10}
		// -> Arrays.sort() �ᵵ ��
		// -> Ȧ��, ¦���� ������ ���ٰ� ����

		int a[] = { 5, 3, 10, 2, 9, 8 };
		Arrays.sort(a);//������������ ����.
		
		int resultA[] = new int[a.length];// ���ο� �迭
		int index = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				resultA[index++] = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				resultA[index++] = a[i];
			}
		}
		
		System.out.println(Arrays.toString(resultA));
	}
}
