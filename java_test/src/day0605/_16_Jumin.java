package day0605;

import java.util.Scanner;

public class _16_Jumin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = a.substring(7, 8);
		
		
		switch (b) {
		case "1": case "3": 
			System.out.println(a + " 남자입니다.");
			break;
		case "2": case "4":
			System.out.println(a + " 여자입니다.");
		break;

		default:
		}
	}

}
