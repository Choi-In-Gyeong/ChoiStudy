package day0607;

import java.util.ArrayList;
import java.util.Scanner;

public class _08_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 숫자 입력 >> ");
			a.add(s.nextInt());
		}
		// for (int i = 0; i < a.size(); i++) {
		// System.out.print(a.get(i) + " ");
		// }

		int min = a.get(0);
		int max = a.get(0);
		for (int i = 0; i < a.size(); i++) {
			if (a.get(min) > a.get(i)) {
				min = i;
			} else if (a.get(max) < a.get(i)) {
				max = i;
			}
		}

		int temp = a.get(max);
		min = max;
		max = temp;
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
	}

}
