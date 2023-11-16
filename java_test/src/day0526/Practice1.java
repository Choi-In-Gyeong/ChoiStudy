package day0526;

public class Practice1 {

	public static void main(String[] args) {

		for (int i = 3; i <= 9; i += 3) {// +=3 or i++하고 if문 3으로 나눈 나머지 0일 때
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i * j);

			}

			System.out.println();// 3줄 띄워지는지.
		}
	}
}
