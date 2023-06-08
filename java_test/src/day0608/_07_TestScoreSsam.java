package day0608;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _07_TestScoreSsam {
	static int score(Scanner s, String kind, int limit) {
		System.out.println(kind + " ������ �Է����ּ���.");
		int num;
		while (true) {
			num = s.nextInt();
			if (num > limit || num < 0) {
				System.out.println("0~ limit ���� �� �Է�");
			} else {
				break;
			}
		}
		return num;
	}
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("(1)�Է�, (2)����, (3)���, (4)���� : ");
			int num = s.nextInt();
			if (num == 1) {
				HashMap<String, Object> map = new HashMap<String, Object>();
				
				System.out.println("����� ���� �Է�");
				
				System.out.print("�̸� : ");
				map.put("name", s.next());
				System.out.print("���� : ");
				map.put("age", s.nextInt());
				
				
				map.put("java", score(s, "�ڹ�", 100));
				map.put("oracle", score(s, "����Ŭ", 100));
				map.put("html", score(s, "html", 200));
				map.put("javascript", score(s, "javascript", 80));
				list.add(map);
			} else if (num == 2) {
				System.out.println("������ ����� �̸�, ���� �Է� : ");
				String name = s.next();
				int age = s.nextInt();
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					if (map.get("name").equals(name)
							&& (int) map.get("age") == age) {
						list.remove(i);
					}
				}
			} else if (num == 3) {
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					System.out.print("�̸� : " + map.get("name"));
					System.out.print(", ���� : " + map.get("age"));
					System.out.print(", �ڹ� : " + map.get("java"));
					System.out.print(", ����Ŭ : " + map.get("oracle"));
					System.out.println();
				}
			} else {
				System.out.println("���� �Ǿ����ϴ�.");
				break;
			}
		}
	}
}