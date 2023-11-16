package day0608;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class _13_Nadagy {

	private String name;
	private int age;
	private String gender;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public _13_Nadagy(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, _13_Nadagy> m = new HashMap<>();

		while (true) {
			System.out.print("(1)입력, (2)삭제, (3)출력, (4)종료");
			int a = s.nextInt();

			if (a == 1) {
				System.out.println("이름 나이 성별을 입력하세요>>");

				String name = s.next();
				int age = s.nextInt();
				String gender = s.next();

				_13_Nadagy n = new _13_Nadagy(name, age, gender);

				m.put(name, n);
			}else if (a == 2) {
				System.out.print("삭제할 이름을 입력하세요>>");
				String name = s.next();
				if (m.containsKey(name)) {
					m.remove(name);
				}
			}else if (a == 3) {
				Set<String> keys = m.keySet();
				Iterator<String> it = keys.iterator();
				while (it.hasNext()) {
					_13_Nadagy n = m.get(it.next());
					System.out.println(n.getName());
					System.out.println(n.getAge());
					System.out.println(n.getGender());
				}
			}else if (a==4) 
				break;
		}
	}

}
