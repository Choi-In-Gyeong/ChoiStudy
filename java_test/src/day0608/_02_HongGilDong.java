package day0608;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _02_HongGilDong {
	public static void main(String[] args) {
		
		ArrayList<HashMap<String, Object>> a = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
		HashMap<String, Object> person = new HashMap<>();
		
		System.out.println((i+1) + "번째 사용자 정보 입력");
		
		System.out.print("이름입력 : ");
		person.put("이름", s.next());
		
		System.out.print("나이입력 : ");
		person.put("나이", s.next());
		
		System.out.print("성별입력 : ");
		person.put("성별", s.next());
		
		System.out.print("주소입력 : ");
		person.put("주소", s.next());
		
		a.add(person);// 어레이리스트에  맵을 넣는 문장.
		
		}
		System.out.println("----------------------");
		
		for (int i = 0; i < a.size(); i++) {
			System.out.print("이름 : " + a.get(i).get("이름") );
			System.out.print(", 나이 : " + a.get(i).get("나이") );
			System.out.print(", 성별 : " + a.get(i).get("성별") );
			System.out.print(", 주소 : " + a.get(i).get("주소") );
			System.out.println();
		}
	}

}
