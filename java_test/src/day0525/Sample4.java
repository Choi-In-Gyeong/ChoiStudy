package day0525;

public class Sample4 {

	public static void main(String[] args) {

		int arr[] = { 4, 3, 5, 2, 1, 0};
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
//			min = Math.min(min, arr[i]);
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
