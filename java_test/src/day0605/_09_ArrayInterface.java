package day0605;

import java.util.Arrays;

public class _09_ArrayInterface {

	public static void main(String[] args) {
		_08_ArrayInterface arr;//2��
		ArrayInterface ar = new ArrayInterface();//5��
		
//		ar = (ArrayInterface) arr;
		arr = ar;//��ĳ����, �������̽��� ���ǵ� �޼���� �Ӽ����� ���ٰ���. => ����� �� �մ� ����� 2������ 5���� ����.
		ar = (ArrayInterface)arr;//2��¥�� �������� �Ǿ��� ������, 5��
		
		int[] a = { 3, 5, 2, 4, 1 };
		ar.MaxSubMin(a);
		ar.MaxChange(a);
	}
}
class ArrayInterface implements _08_ArrayInterface {

	@Override
	public void MaxSubMin(int[] a) {
		int max = 0;//index��
		int min = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[max] < a[i]) {
				max = i;
			} else if (a[min] > a[i]) {
				min = i;
			}
		}
		System.out.println(a[max] - a[min]);
	}

	@Override
	public void MaxChange(int[] a) {
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[max] < a[i]) {
				max = i;
			}
		}
		int temp = a[max];
		a[max] = a[a.length-1];
		a[a.length-1] = temp;
		System.out.println(Arrays.toString(a));
	}
}
