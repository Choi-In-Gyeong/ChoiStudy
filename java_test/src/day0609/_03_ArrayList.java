package day0609;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for (int i = 1; i < 5; i++) {
			System.out.println(i + "번째 숫자 입력 : ");
			l.add(s.nextInt());
		}
	}

}
