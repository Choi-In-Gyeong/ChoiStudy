package day0605;

import java.util.Scanner;

public class _19_JuminMUNJA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է� >>>");
		String a = s.next();
		String b = a.substring(7, 8);
		
		switch (b) {
		case "1": case "3":
			System.out.println(a +" ����");
			break;
		case "2": case "4":
			System.out.println(a + " ����");
			break;
		default:
		}
		
		
		if (b.equals("1") || b.equals("3")) {
			System.out.println(a +" ����");
		}else if (b.equals("2") || b.equals("4")) {
			System.out.println(a + " ����");
		}
		
		int num = Integer.parseInt(b);
		if (num == 1 || num == 3) {
			System.out.println(a +" ����");
		}else if (num == 2 || num == 4) {
			System.out.println(a + " ����");
		}
		
		char ch = a.charAt(7);
		if (ch == '1' || ch == '3') {
			System.out.println(a +" ����");
		}else if (ch == '2' || ch == '4') {
			System.out.println(a +" ����");
		}
		
		switch (ch) {
		case '1': case'3':
			System.out.println(a +" ����");
			break;
		case '2': case'4':
			System.out.println(a +" ����");
			break;
		default:
		}
		
	}
}