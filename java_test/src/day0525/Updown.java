package day0525;

import java.util.Random;
import java.util.Scanner;

public class Updown {

	public static void main(String[] args) {
		System.out.println("컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다.");
		System.out.println("이 숫자를 맞춰주세요.");

		Random r = new Random();
		Scanner s = new Scanner(System.in);

		int a = r.nextInt(100) + 1;
		int i = 0;

		while (true) {
			i++;
			System.out.print("1-100 숫자 입력 : ");
			int b = s.nextInt();

			if (a > b) {
				System.out.println("UP");
			} else if (a < b) {
				System.out.println("DOWN");
			} else if (a == b) {
				System.out.println("정답입니다. " + i + "번 만에 맞췄습니다.");
				break;
			}
		}
	}
}
