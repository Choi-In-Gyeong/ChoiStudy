package day0609;

import java.util.*;

public class _10_MineCraft {
	int p;//참여 인원수
	
	
	static int enter(int p, Scanner s){
	System.out.println(p + "p 엔터 누르면 시작");
		s.nextLine();
		Calendar now = Calendar.getInstance();
		int s1 = now.get(Calendar.SECOND);
		System.out.println("현재시간의 초 " + s1 + "초");
		System.out.println("10초 후에 엔터 누르세용");
		
		s.nextLine();
		now = Calendar.getInstance();
		int s2 = now.get(Calendar.SECOND);
		Calendar.getInstance().clear();
		System.out.println("현재시간의 초 " + s2 + "초");
		
		s.nextLine();
		int cha = (s2 > s1) ? s2-s1 : (s2 + 60) - s1;
		System.out.println("둘의 차이는 ? : " + cha + "초");
		
		
		return Math.abs(10-cha);
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = enter(1, s);
		int b = enter(2, s);
		
		
		if (a<b) {
			System.out.println("1p 이김");
		}else if (a>b) {
			System.out.println("2p 이김");
		}else
			System.out.println("비김");

	}

}
