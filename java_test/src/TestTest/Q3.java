package TestTest;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		// int arr[] = {3, 5, 2, 9, 8};
		// °á°ú : {9, 5, 2, 3, 8}
		
		int[] arr = {3, 5, 2, 9, 8};
		
		int maxindex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[maxindex] < arr[i]) {
				maxindex = i;
			}
		}
		
		int temp = arr[maxindex];
		arr[maxindex] = arr[arr.length - 5];
		arr[arr.length - 5] = temp;
		System.out.println(Arrays.toString(arr));
		
	}

}
