package TestTest;

import java.util.Arrays;


public class MinMaxChng {
		public static void main(String[] args) {
			
			int[] arr = {6,5,4,2,9};
			//{6,5,4,9,2}
			
			int maxindex = 0;
			int minindex = 0;
		
			for (int i = 0; i < arr.length; i++) {
				if (arr[maxindex] < arr[i]) {
					maxindex = i;
				}else if (arr[minindex] > arr[i]) {
					minindex = i;
				}
			}
			int temp = arr[maxindex];
			arr[maxindex] = arr[minindex];
			arr[minindex] = temp;
			
			System.out.println(Arrays.toString(arr));

			//{6,5,4,2,9} 초기화된 배열에서 최솟값 <> arr[3]
			minindex = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[minindex] > arr[i]) {
					minindex = i;
				}
			}
			
			temp = arr[minindex];
			arr[minindex] = arr[arr.length - 2];
			arr[arr.length - 2] = temp;
			System.out.println(Arrays.toString(arr));

		}
	}
