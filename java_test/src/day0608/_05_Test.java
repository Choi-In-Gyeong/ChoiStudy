package day0608;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _05_Test {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			System.out.print("(1)�Է�, (2)����, (3)���, (4)����");
			int a = s.nextInt();

			if (a == 1) {
				HashMap<String, Object> map = new HashMap<>();//�Է��� ���� ����Ʈ�� ����ִ¾� 

				System.out.println("�Էºκ�");
			

					map.put("name", s.next());
					map.put("age", s.next());
					map.put("addr", s.next());
					list.add(map);
				

			} else if (a == 2) {
				System.out.println("�����κ�");

				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);//get(i)�� �ҷ��ͼ� map���� �ʱ�ȭ
					String sc = s.next();

					if (map.get("name").equals(sc)) {
						list.remove(i);
					}
				}

			} else if (a == 3) {
				System.out.println("��ºκ�");
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					System.out.print("�̸� : " + map.get("name"));
					System.out.print(", ���� : " + map.get("age"));
					System.out.print(", �ּ� : " + map.get("addr"));
					System.out.println();
				}
				
			} else if (a == 4) {
				System.out.println("����κ�");
				break;
			}
		}
	}
}
