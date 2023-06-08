package day0608;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class _10_Person {
	private String name;
	private int age;
	private String addr;

	public _10_Person(){}
	
	public _10_Person(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		HashMap<String, _10_Person> m = new HashMap<>();

		while (true) {
			System.out.print("(1)�Է�, (2)����, (3)���, (4)����");
			int a = s.nextInt();

			if (a == 1) {

				System.out.print("�̸�, ����, �ּҸ� ���������� �Է�>>");

				String name = s.next();
				int age = s.nextInt();
				String addr = s.next();

				_10_Person p = new _10_Person(name, age, addr);
				m.put(name, p);

			} else if (a == 2) {
				System.out.println("������ ����� �̸� �Է� : ");
				String name = s.next();
				if (m.containsKey(name)) {//������ Ű�� �����ϰ������� true ����
					m.remove(name);
				}

			} else if (a == 3) {
				Set<String> keys = m.keySet();//�ؽø��� ��� Ű�� ���� Ű�÷��� ����
				Iterator<String> it = keys.iterator();

				while (it.hasNext()) {
					_10_Person p = m.get(it.next());
					System.out.print("�̸� : " + p.getName());
					System.out.print(", ���� : " + p.getAge());
					System.out.print(", �ּ� : " + p.getAddr());
					System.out.println();
				}
			} else if (a == 4) {
				System.out.println("����");
				break;
			}
		}
	}

}
