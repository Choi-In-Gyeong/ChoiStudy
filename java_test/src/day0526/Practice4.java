package day0526;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int arr[] = new int[5];
		int count = 0;

		// while (true) {
		// System.out.print("숫자를 입력하세요. 음수는 제외.");
		// int i = s.nextInt();
		//
		// if (i > 0) {
		// arr[count] = i;
		// count++;
		// } else {
		// System.out.println("양수를 입력해주세요.");
		// }
		//
		// if (count == 5) {
		// System.out.println("배열이 가득 찼습니다. 입력을 종료합니다.");
		// break;
		// }
		// }
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자를 입력하세요. 음수는 제외- >> ");

			int num = s.nextInt();
			if (num >= 0) {
				arr[i] = num;
			}else {
				System.out.println("음수 안돼요.");
				i--;
			}
		}
		System.out.println("입력된 숫자들:");
		System.out.println(Arrays.toString(arr));
		
		s.close();

	}
}
