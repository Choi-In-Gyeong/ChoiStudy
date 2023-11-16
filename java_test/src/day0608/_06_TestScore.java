package day0608;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _06_TestScore {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while (true) {
			
			System.out.print("(1)�Է�, (2)����, (3)���, (4)����");
			int a = s.nextInt();

			if (a == 1) {
				System.out.println("�̸�, ����, �ڹ�����, ����Ŭ������ �Է��ϼ���.");
				HashMap<String, Object> map = new HashMap<>();
				map.put("name", s.next());
				map.put("age", s.next());
				map.put("java", s.nextInt());
				map.put("oracle", s.nextInt());
				list.add(map);
			} else if (a == 2) {
				System.out.println("�����κ�");
				String name = s.next();
				String age = s.next();

				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					
					if (map.get("name").equals(name) && map.get("age").equals(age)) {
						System.out.println("�����մϴ�.");
						list.remove(i);
					}
				}
			} else if (a == 3) {
				System.out.println("��ºκ�");
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					System.out.print("�̸� :" + map.get("name"));
					System.out.print(",�̸� :" + map.get("age"));
					System.out.print(", �ڹ����� :" + map.get("java"));
					System.out.print(", ����Ŭ���� :" + map.get("oracle"));
					System.out.println();
				}
			} else if (a == 4) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			
		}//while-end
	}//main-end
}//class-end
