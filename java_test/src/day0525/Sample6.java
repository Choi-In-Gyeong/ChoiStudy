package day0525;

public class Sample6 {

	public static void main(String[] args) {
		int arr[] = { 4, 3, -5, 2, -1, -8, 7, 9};
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
//				sum += Math.abs(arr[i]);//���� ���ϴ� �Լ�
			if (arr[i]<0) {
				sum += -arr[i];//�����϶� ���� ���ϱ� 
			}else{
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
}
