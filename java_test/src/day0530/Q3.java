package day0530;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		// 3. {5, 3, 10, 2, 9, 8}
		// 오름차순 정렬하기. 단, 홀수먼저 정렬하고 짝수 정렬
		// ex) {3, 5, 9, 2, 8, 10}
		// -> Arrays.sort() 써도 됨
		// -> 홀수, 짝수의 개수는 같다고 가정

		int a[] = { 5, 3, 10, 2, 9, 8 };
		Arrays.sort(a);//오름차순으로 정렬.
		
		int resultA[] = new int[a.length];// 새로운 배열
		int index = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				resultA[index++] = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				resultA[index++] = a[i];
			}
		}
		
		System.out.println(Arrays.toString(resultA));
	}
}
