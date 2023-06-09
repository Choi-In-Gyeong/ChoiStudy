package TestTest;

import java.util.*;


public class IteratorEx {

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

	public IteratorEx(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, IteratorEx> m = new HashMap<>();

		while (true) {
			System.out.print("(1)�Է�, (2)����, (3)���, (4)����");
			int a = s.nextInt();

			if (a == 1) {
				System.out.println("�̸� ���� ������ �Է��ϼ���>>");

				String name = s.next();
				int age = s.nextInt();
				String gender = s.next();

				IteratorEx n = new IteratorEx(name, age, gender);

				m.put(name, n);
			} else if (a == 2) {
				System.out.print("������ �̸��� �Է��ϼ���>>");
				String name = s.next();
				if (m.containsKey(name)) {
					m.remove(name);
				}
			} else if (a == 3) {
				Set<String> keys = m.keySet();
				Iterator<String> it = keys.iterator();
				while (it.hasNext()) {
					IteratorEx n = m.get(it.next());
					System.out.println(n.getName());
					System.out.println(n.getAge());
					System.out.println(n.getGender());
				}
			} else if (a == 4)
				break;
		}
	}
	

}
