package TestTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q5 {
	
	
	static int score(Scanner s, String kind, int limit) {
		System.out.println(kind + " 점수를 입력해주세요.");
		int num;
		while (true) {
			num = s.nextInt();
			if (num > limit || num < 0) {
				System.out.println("0~ limit 사이 값 입력");
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
			System.out.print("(1)입력, (2)삭제, (3)출력, (4)종료 : ");
			int num = s.nextInt();
			if (num == 1) {
				HashMap<String, Object> map = new HashMap<String, Object>();
				
				System.out.println("사용자 정보 입력");
				
				System.out.print("이름 : ");
				map.put("name", s.next());
				
				map.put("java", score(s, "java", 30));
				map.put("oracle", score(s, "oracle", 50));
				map.put("html", score(s, "html", 20));
				list.add(map);
				
				
			} else if (num == 2) {
				System.out.println("삭제할 사용자 이름 입력 : ");
				String name = s.next();
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					if (map.get("name").equals(name)) {
						list.remove(i);
					}
				}
			} else if (num == 3) {
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					int j = (int) map.get("java");
					int o = (int) map.get("oracle");
					int h = (int) map.get("html");

					System.out.print("이름 : " + map.get("name"));
					System.out.print(", 총점 : " + (j + o + h));
				
					System.out.println();
				}
			} else {
				System.out.println("종료 되었습니다.");
				break;
			}
		}
	}
}