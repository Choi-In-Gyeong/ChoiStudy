package day0601_2;

import java.util.Arrays;
//import java.util.Scanner;


public class _02_CalcMain {

	public static void main(String[] args) {
		_01_Calc calc = new _01_Calc();
		calc.message();//message()���� ����Ʈ
		
		System.out.println(calc.message2());//mainâ���� ����Ʈ

		calc.sum(1,2);//sum()���� ����Ʈ
		
		int a = calc.sum2(3,4);//main â���� ���� a�����ؼ� ����Ʈ
		System.out.println(a);
		
		double b = calc.sum2(1, 2.5);//�����ε� : ���������� , �ڷ��� ������ �ٸ��� ����.
		System.out.println(b);
		
//		Scanner s = new Scanner(System.in);
//		int c = s.nextInt();
//		int d = s.nextInt();
//		calc.max(c,d);//c,d�� �����ϴ� ������ ������ a,b�� ����Ǿ��� �����ΰ�..?
//		s.close();
		
		int arr[] = {3, 2, 6, 5, 4};
//		calc.arr1(arr); 
//		System.out.println(Arrays.toString(arr));
////		�迭 �� ���� ���� ���ڿ� ���� ū ���� �ٲٱ� {3,6,2,5,4}

		calc.arr2(arr); 
		System.out.println(Arrays.toString(arr));
//		�迭 �� ���� ���� ���ڿ� ������ �迭 ���� �ٲٱ� {3,4,6,5,2} arr[2] <> arr[4]

		

	}

}
