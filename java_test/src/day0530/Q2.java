package day0530;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// 2. 5개의 숫자를 입력받아서 배열 만들기. 단, 홀수만 들어가도록
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {
			
			System.out.print("숫자를 입력하세요. >>");
			int num = s.nextInt();
			if (num % 2 != 0) {
				a[i] = num;
			} else {
				System.out.println("짝수 안돼요.");
				i--;
			}
		}
		System.out.println("홀수로만 이루어진 배열 : " + Arrays.toString(a));
		s.close();
	}

}
