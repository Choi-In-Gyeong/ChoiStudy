package day0525;

public class Sample3 {

	public static void main(String[] args) {
//		System.out.println(arr.length);//length�� ��ȣ�� ���� => ������ �ִ�.
//		int arr2[] = new int[3];//new�� ���� �� ������ ��ü��. => �޼��尡 �ְ�, ������ �ִ�.
//		
//		System.out.println();
		
//		int sum =  0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//			System.out.println(arr[i] );
//		}
//		System.out.println("\n" + sum);
		
		
		int arr[] = {5,2,3,1,4,8};
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
			max = Math.max(max, arr[i]);
		}
		System.out.println(max);
	}
	

}
