package day0607;

import java.util.HashMap;
import java.util.Scanner;

public class _09_HashMap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> javaScore = new HashMap<>();
		// 5 ���� ���� ����
		javaScore.put("�輺��", 97);
		javaScore.put("Ȳ����", 88);
		javaScore.put("�賲��", 98);
		javaScore.put("���繮", 70);
		javaScore.put("�ѿ���", 99);
		System.out.println("HashMap�� ��� ���� :" + javaScore.size());
		
		
		for (int i = 0; i < javaScore.size(); i++) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			String a = s.next();
			
			if (javaScore.containsKey(a) == true) {
			System.out.println(javaScore.get(a));
			}else if (javaScore.containsKey(a) != true) {
				System.out.println("�׷��������.");
			}
			
		}
		
		while (true) {
			System.out.print("�̸��� �Է��ϼ��� : ");
			String a = s.next();
			
			if (!javaScore.containsKey(a)) {
				System.out.println("�׷��������.");
			}else{
				System.out.println(javaScore.get(a));
			}
		}
	}

}
