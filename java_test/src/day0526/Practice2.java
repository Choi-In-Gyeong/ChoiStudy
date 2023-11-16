package day0526;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {// 몇번 해야할지 예상안될때는 "무한루프" =>특정조건 전까지

		Scanner s = new Scanner(System.in);
		int sum = 0;
		
		while (true) {

			System.out.print("숫자를 입력하세요. >>");
			
			int i = s.nextInt();

			// if (i<0) {
			// System.out.println("양수만 입력하세요~");
			// continue;
			// }
			// sum += i;
			//
			// if (i==0){
			// System.out.println("0을 입력해서 게임을 종료합니다.");
			// break;

			if (i < 0) {
				System.out.println("양수만 입력하세요~");
			} else if (i == 0) {
				System.out.println("0을 입력해서 게임을 종료합니다.");
				break;
			} else {
				sum += i;
			}
		}
		System.out.println("입력된 숫자들의 합은 " + sum + "입니다.");
		
	}
}
