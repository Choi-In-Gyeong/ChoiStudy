package day0608;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _06_TestScore {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while (true) {
			
			System.out.print("(1)입력, (2)삭제, (3)출력, (4)종료");
			int a = s.nextInt();

			if (a == 1) {
				System.out.println("이름, 나이, 자바점수, 오라클점수를 입력하세요.");
				HashMap<String, Object> map = new HashMap<>();
				map.put("name", s.next());
				map.put("age", s.next());
				map.put("java", s.nextInt());
				map.put("oracle", s.nextInt());
				list.add(map);
			} else if (a == 2) {
				System.out.println("삭제부분");
				String name = s.next();
				String age = s.next();

				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					
					if (map.get("name").equals(name) && map.get("age").equals(age)) {
						System.out.println("삭제합니다.");
						list.remove(i);
					}
				}
			} else if (a == 3) {
				System.out.println("출력부분");
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					System.out.print("이름 :" + map.get("name"));
					System.out.print(",이름 :" + map.get("age"));
					System.out.print(", 자바점수 :" + map.get("java"));
					System.out.print(", 오라클점수 :" + map.get("oracle"));
					System.out.println();
				}
			} else if (a == 4) {
				System.out.println("종료합니다.");
				break;
			}
			
			
		}//while-end
	}//main-end
}//class-end
