package day0609;

import java.util.*;

public class _10_MineCraft {
	int p;//���� �ο���
	
	
	static int enter(int p, Scanner s){
	System.out.println(p + "p ���� ������ ����");
		s.nextLine();
		Calendar now = Calendar.getInstance();
		int s1 = now.get(Calendar.SECOND);
		System.out.println("����ð��� �� " + s1 + "��");
		System.out.println("10�� �Ŀ� ���� ��������");
		
		s.nextLine();
		now = Calendar.getInstance();
		int s2 = now.get(Calendar.SECOND);
		Calendar.getInstance().clear();
		System.out.println("����ð��� �� " + s2 + "��");
		
		s.nextLine();
		int cha = (s2 > s1) ? s2-s1 : (s2 + 60) - s1;
		System.out.println("���� ���̴� ? : " + cha + "��");
		
		
		return Math.abs(10-cha);
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = enter(1, s);
		int b = enter(2, s);
		
//		s.nextInt();
		
		if (a<b) {
			System.out.println("1p �̱�");
		}else if (a>b) {
			System.out.println("2p �̱�");
		}else
			System.out.println("���");

	}

}
