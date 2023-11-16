package day0608;

import java.util.HashMap;
import java.util.Scanner;

public class _01_HashMap {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<>();
		
		dic.put("baby", "아기");
		dic.put("flower", "꽃");
		dic.put("love", "사랑");
		
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("찾고싶은 단어는?");
			String eng = s.next();
			if (eng.equals("0")) {
				System.out.println("종료");
				break;
			}
			
			String kor = dic.get(eng);
			if (kor == null) {
				System.out.println(eng + "없는단어입니다.");
			}else 
				System.out.println();
		}
		
		
	}

}
