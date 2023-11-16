package TestTest;

public class Q2 {

	public static void main(String[] args) {
		// 1. 구구단에서 5단을 제외하고 출력

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 5) {
					continue;
				}
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println();
		}
	}

}
