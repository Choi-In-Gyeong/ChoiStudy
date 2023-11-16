package day0601;

import java.util.Scanner;

public class _06_Km2Mile {
	private double KM;
	
	_06_Km2Mile(double KM) {
		this.KM = KM;
	}
	
	
	
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.println("Km을 mile로 바꿉니다.");
		System.out.print("km을 입력하세요>>");
		KM = s.nextInt();
		System.out.println("변환 결과: " + (double)(KM/1.6) +"mile입니다.");
		s.close();
		
	}

}
