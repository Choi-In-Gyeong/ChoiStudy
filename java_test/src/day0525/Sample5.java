package day0525;

public class Sample5 {

	public static void main(String[] args) {
		int arr[] = { 4, 3, -5, 2, -1, -8, 7, 9};

		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > 0) {
//				min = Math.min(min, arr[i]);
			if (arr[i] > 0 && min > arr[i]) {//������ ��
				min = arr[i];
			}
		}
		System.out.println("����߿� ���� ���� ��"+ min);
	}
}
