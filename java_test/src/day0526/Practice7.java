package day0526;
import java.util.Arrays;
import java.util.Scanner;
public class Practice7 {
	public static void main(String[] args) {
		
		

		Scanner s = new Scanner(System.in);
		int a[] = new int[6];

		System.out.print("숫자를 입력하세요.>> ");

		for (int i = 0; i < 6; i++) {
			a[i] = s.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 != 0) {
				a[i] = -a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		s.close();

		
	}
}
