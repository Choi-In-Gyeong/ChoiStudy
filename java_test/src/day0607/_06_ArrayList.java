package day0607;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_ArrayList {

	public static void main(String[] args) {
		// ���ڿ��� ���԰����� ArrayList �÷��� ����
		ArrayList<String> a = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + " ��° ���ڿ� �Է�>>");
			String s = scan.next();
			a.add(s);
		}

		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}

		// ���� �� ���ڿ� ã�Ƽ� ���
		String str = "";
		for (int i = 0; i < a.size(); i++) {
			if (str.length() < a.get(i).length()) {
				str = a.get(i);
			}
		}
		for (int i = 0; i < a.size(); i++) {
			if (str.length() == a.get(i).length()) {
				System.out.println(a.get(i));
			}
		}
	}

}