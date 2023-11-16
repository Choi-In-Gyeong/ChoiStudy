package day0607;

import java.util.HashMap;
import java.util.Scanner;

public class _09_HashMap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Integer> javaScore = new HashMap<>();
		// 5 개의 점수 저장
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		System.out.println("HashMap의 요소 개수 :" + javaScore.size());
		
		
		for (int i = 0; i < javaScore.size(); i++) {
			System.out.print("이름을 입력하세요 : ");
			String a = s.next();
			
			if (javaScore.containsKey(a) == true) {
			System.out.println(javaScore.get(a));
			}else if (javaScore.containsKey(a) != true) {
				System.out.println("그런사람없음.");
			}
			
		}
		
		while (true) {
			System.out.print("이름을 입력하세요 : ");
			String a = s.next();
			
			if (!javaScore.containsKey(a)) {
				System.out.println("그런사람없음.");
			}else{
				System.out.println(javaScore.get(a));
			}
		}
	}

}
