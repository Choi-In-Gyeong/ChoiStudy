package day0608;

import java.util.HashMap;
import java.util.Scanner;

public class _01_HashMap {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<>();
		
		dic.put("baby", "�Ʊ�");
		dic.put("flower", "��");
		dic.put("love", "���");
		
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("ã����� �ܾ��?");
			String eng = s.next();
			if (eng.equals("0")) {
				System.out.println("����");
				break;
			}
			
			String kor = dic.get(eng);
			if (kor == null) {
				System.out.println(eng + "���´ܾ��Դϴ�.");
			}else 
				System.out.println();
		}
		
		
	}

}
