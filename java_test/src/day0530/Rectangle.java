package day0530;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;//���� ����
	
	public int getArea(){
		return width * height;//�޼��� ����
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//��ü���� =>importȣ��
		Rectangle r = new Rectangle();//��ü����
		
		System.out.print("�ʺ� �Է�>> ");
		r.width = s.nextInt();
		System.out.print("���� �Է�>> ");
		r.height = s.nextInt();//�������� ä����.
		
		System.out.println("�簢���� ������ : " + r.getArea());//r.getArea => �޼��� ȣ��
		s.close();

	}

}
