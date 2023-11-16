package day0601;

import java.util.Scanner;

public class _05_Won2DollarMain {

	public static void main(String[] args) {

		_04_Won2Dollar toDollar = new _04_Won2Dollar(1200); // 1달러는 1200원 //변수가
															// 담겼으니까 변수를 담을수 있는
															// 생성자 필요.

		Scanner s = new Scanner(System.in);

		System.out.println("원을 달러로 바꿉니다.");
		System.out.print("원을 입력하세요>>");
		toDollar.won = s.nextInt();

		toDollar.run();

		s.close();

	}

}
