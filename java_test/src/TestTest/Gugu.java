package TestTest;

public class Gugu {

	public static void main(String[] args) {

		// ������

		for (int i = 2; i <= 9; i++) {// �� = row
			for (int j = 1; j <= 9; j++) {// �� = column
				System.out.println(i + "x" + j + "=" + i * j);
			}// inner-for
			System.out.println();
		}// out-for

		// ������2
		for (int i = 1; i <= 9; i++) {// �� = row
			for (int j = 2; j <= 9; j++) {// �� = column
				System.out.print(j + "x" + i + "=" + i * j + "\t");
			}// inner-for
			System.out.println();
		}// out-for

	}

}
