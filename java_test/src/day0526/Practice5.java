package day0526;

import java.util.Arrays;

public class Practice5 {

	public static void main(String[] args) {
		int arr[] = {7,6,9,3,5};
		
		for (int i = 0; i < arr.length; i++) {//i ���� 5���ݺ�
			int minIdx = i; //i = 0
			for (int j = i+1; j < arr.length; j++) {//j���� 4���ݺ�
				if (arr[minIdx] > arr[j]) {//7 > 6
					minIdx = j; //minIdx = 1
				}
			}
			int temp = arr[minIdx]; // int temp = arr[1]=6
			arr[minIdx] = arr[i]; //arr[minidx] = arr[0] =7
			arr[i] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
}
