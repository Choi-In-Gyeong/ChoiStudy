package day0608;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _02_HongGilDong {
	public static void main(String[] args) {
		
		ArrayList<HashMap<String, Object>> a = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
		HashMap<String, Object> person = new HashMap<>();
		
		System.out.println((i+1) + "��° ����� ���� �Է�");
		
		System.out.print("�̸��Է� : ");
		person.put("�̸�", s.next());
		
		System.out.print("�����Է� : ");
		person.put("����", s.next());
		
		System.out.print("�����Է� : ");
		person.put("����", s.next());
		
		System.out.print("�ּ��Է� : ");
		person.put("�ּ�", s.next());
		
		a.add(person);// ��̸���Ʈ��  ���� �ִ� ����.
		
		}
		System.out.println("----------------------");
		
		for (int i = 0; i < a.size(); i++) {
			System.out.print("�̸� : " + a.get(i).get("�̸�") );
			System.out.print(", ���� : " + a.get(i).get("����") );
			System.out.print(", ���� : " + a.get(i).get("����") );
			System.out.print(", �ּ� : " + a.get(i).get("�ּ�") );
			System.out.println();
		}
	}

}
