package day0605;

import java.util.Scanner;

public class _16_Jumin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = a.substring(7, 8);
		
		
		switch (b) {
		case "1": case "3": 
			System.out.println(a + " �����Դϴ�.");
			break;
		case "2": case "4":
			System.out.println(a + " �����Դϴ�.");
		break;

		default:
			System.out.println("��Ȯ�� �������� �Է��ϼ���.");
			break;
		}
	}

}
