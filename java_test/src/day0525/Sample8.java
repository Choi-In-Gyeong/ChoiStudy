package day0525;

import java.util.Arrays;

public class Sample8 {

	public static void main(String[] args) {
		int arr[] = { 7, 6, 9, 3, 5 };

		int minIndx = 0;
		// int maxIndx = 0;

		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[minIndx] > arr[j]) {
					minIndx = j;
				}
				int temp = arr[i];// 3
				arr[minIndx] = arr[j];
				arr[j] = temp;

			}
			// System.out.println(arr[maxIndx]);
			// System.out.println(arr[minIndx]);
			System.out.println(Arrays.toString(arr));

		}
	}

}
