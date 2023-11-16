package day0608;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _05_Test {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();

		while (true) {
			System.out.print("(1)입력, (2)삭제, (3)출력, (4)종료");
			int a = s.nextInt();

			if (a == 1) {
				HashMap<String, Object> map = new HashMap<>();//입력한 것을 리스트에 담아주는애 

				System.out.println("입력부분");
			

					map.put("name", s.next());
					map.put("age", s.next());
					map.put("addr", s.next());
					list.add(map);
				

			} else if (a == 2) {
				System.out.println("삭제부분");

				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);//get(i)로 불러와서 map값을 초기화
					String sc = s.next();

					if (map.get("name").equals(sc)) {
						list.remove(i);
					}
				}

			} else if (a == 3) {
				System.out.println("출력부분");
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					System.out.print("이름 : " + map.get("name"));
					System.out.print(", 나이 : " + map.get("age"));
					System.out.print(", 주소 : " + map.get("addr"));
					System.out.println();
				}
				
			} else if (a == 4) {
				System.out.println("종료부분");
				break;
			}
		}
	}
}
