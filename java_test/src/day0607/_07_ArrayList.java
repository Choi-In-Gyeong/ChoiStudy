package day0607;

import java.util.ArrayList;
import java.util.Scanner;

public class _07_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			a.add(s.nextInt());
		}
		
		for (int i = 0; i < a.size(); i++) {
			int num = a.get(i);
			System.out.print(num + " ");
		}
		
		int min = a.get(0);// �ʱ�ȭ
		for (int i = 1; i < a.size(); i++) {
			if (min > a.get(i)) {
				min = a.get(i);
			}
		}
		
		int cnt = 0;
		for (int i = 0; i < a.size(); i++) {
			if (min == a.get(i)) {
				cnt ++;
			}
			
		}
		System.out.println("\n" + " �������� �� :" + min);
		System.out.println("���� :" + cnt);
		
		
	}

}
