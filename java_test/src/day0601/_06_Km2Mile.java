package day0601;

import java.util.Scanner;

public class _06_Km2Mile {
	private double KM;
	
	_06_Km2Mile(double KM) {
		this.KM = KM;
	}
	
	
	
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.println("Km�� mile�� �ٲߴϴ�.");
		System.out.print("km�� �Է��ϼ���>>");
		KM = s.nextInt();
		System.out.println("��ȯ ���: " + (double)(KM/1.6) +"mile�Դϴ�.");
		s.close();
		
	}

}
