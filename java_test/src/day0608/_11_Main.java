package day0608;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class _11_Main {

	public static void main(String[] args) {
		
		_10_Person yoon = new _10_Person();
		yoon.setAddr("����");
		System.out.println(yoon.getAddr());
		
		_10_Person choi = new _10_Person("���ΰ�", 27, "��õ");
		System.out.println(choi.getName());
		choi.setName("������");
		System.out.println(choi.getName());

		Scanner s = new Scanner(System.in);
		HashMap<String, _10_Person> m = new HashMap<>();

		while (true) {
			System.out.println("1.�Է�, 2.���  3.STOP");
			int a = s.nextInt();
			if (a == 1) {
				for (int i = 0; i < 2; i++) {
					String name = s.next();
					int age = s.nextInt();
					String addr = s.next();

					_10_Person p = new _10_Person(name, age, addr);

					m.put(p.getName(), p);
			}
			}else if (a == 2) {
				Set<String> keys = m.keySet();
				Iterator<String> it = keys.iterator();// Iterator swing�� GUI���� ���
				while(it.hasNext()){
					_10_Person n = m.get(it.next()); // ������������ �������. ��ü�� String�̳� �������� �ƴ� ��ü�μ���,
					System.out.print("�̸� : " + n.getName());
					System.out.print(", ���� : " + n.getAge());
					System.out.print(", �ּ� : " + n.getAddr());
					System.out.println();
				}
			}else if (a==3) {
				break;
			}
		}
	}
}
