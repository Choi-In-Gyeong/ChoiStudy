package TestTest;

import java.util.Scanner;

public class _14_StringEx {

	public static void main(String[] args) {

		String s1 = "ȫ�浿";// ���ͷ� ���̺� �ִ�
		String s2 = "ȫ�浿";
		String s3 = new String("ȫ�浿");// ���޸𸮿� �ִ�

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));// �� �̰Ž��.

		s3 = s3 + "�ٺ�";
		s3 = s3.concat(" �ٺ�");// concat�� ���ڿ��� �̾���̴� �޼���, ������ ���̽������� ���ڿ� �̾���̴� ����
		System.out.println(s3);

		String s4 = "   Java ���α׷���      ";

		System.out.println(s4.concat("aa"));
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		System.out.println(s4.trim().toUpperCase() + "Test");
		
		

		String java = "Java";
		String python = "java";

		int a = java.compareTo(python);// �ڹٰ� ���̽㺸�� ���������� ���������� ���� ����, 
									   // �ʰԳ����� �������
		if (a == 0) {
			System.out.println("���������� ���� ����");
		} else if (a < 0) {
			System.out.println(java + " < " + python);
		} else
			System.out.println(java + " > " + python);
		
		Scanner s = new Scanner(System.in);
		
//		String t1 = s.next().toUpperCase();
//		String t2 = s.next().toUpperCase();
//		
//		int d = t1.compareTo(t2);
//
//		
//		if (d == 0) {
//			System.out.println("���������� ���� ����");
//		} else if (d < 0) {
//			System.out.println(t1 + " < " + t2);
//		} else
//			System.out.println(t1 + " > " + t2);
//		
//		String x = s.nextLine();//���� �־ �ϳ��� ���ڿ��� �ν� 
//		String y = s.nextLine();
//		
//		System.out.println(x);
//		System.out.println(y);
		
		String s8 = "\t test   \n";
		String s7 = "    test   ";
			
		System.out.print(s8);
		System.out.print(s7);
		System.out.print(s8.trim());
		System.out.print(s7.trim());//\t,\n���λ��� ���鵵 ������
		
		

	}
}
