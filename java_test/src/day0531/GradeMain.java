package day0531;

import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		
		Grade me = new Grade(math, science, english);//
		System.out.println("����� " + me.average()); // average()�� ����� ����Ͽ� ����
		
		sc.close();
	}
}

//���� ����.
//���� 3�� ���� ������ ����� , ���� �ʱ�ȭ.  this ��������.
