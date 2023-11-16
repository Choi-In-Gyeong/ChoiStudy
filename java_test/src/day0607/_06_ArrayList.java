package day0607;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_ArrayList {

	public static void main(String[] args) {
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + " 번째 문자열 입력>>");
			String s = scan.next();
			a.add(s);
		}

		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}

		// 가장 긴 문자열 찾아서 출력
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