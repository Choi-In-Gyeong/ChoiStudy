package day0526;

public class Practice3 {

	public static void main(String[] args) {
		
		int arr[] = {10, -20, 30, 40, 50};
		int sum = 0;
		int count = 0;
		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i]>0) {
//				count++;
//				sum += arr[i];
//			}
//		}
		for (int num : arr) {
			if (num >= 0) {
				sum += num;
				count ++;
			}
		}
		System.out.println(sum/(double)count);// ����ȯ ĳ���� �����ϳ��� �������̸�, ��������, ������
	}

}
