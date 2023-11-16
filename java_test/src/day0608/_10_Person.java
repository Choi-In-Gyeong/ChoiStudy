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

	public _10_Person() {
	}

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
			System.out.print("(1)입력, (2)삭제, (3)출력, (4)종료");
			int a = s.nextInt();

			if (a == 1) {

				System.out.print("이름, 나이, 주소를 순차적으로 입력>>");

				String name = s.next();
				int age = s.nextInt();
				String addr = s.next();

				_10_Person p = new _10_Person(name, age, addr);
				m.put(name, p);

			} else if (a == 2) {
				System.out.println("삭제할 사용자 이름 입력 : ");
				String name = s.next();
				if (m.containsKey(name)) {// 지정된 키를 포함하고있으면 true 리턴
					m.remove(name);
				}

			} else if (a == 3) {
				Set<String> keys = m.keySet();// 해시맵의 모든 키를 담은 키컬렉션 리턴
				Iterator<String> it = keys.iterator();

				while (it.hasNext()) {
					_10_Person p = m.get(it.next());
					System.out.print("이름 : " + p.getName());
					System.out.print(", 나이 : " + p.getAge());
					System.out.print(", 주소 : " + p.getAddr());
					System.out.println();
				}
			} else if (a == 4) {
				System.out.println("종료");
				break;

			}
		}
	}
}
