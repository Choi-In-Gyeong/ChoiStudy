package day0530;

import java.util.Arrays;

public class Sample1 {
	public static void main(String[] args) {
		Calc calc = new Calc();//객체생성
		int a = 10;
		calc.test1(a);
		
		int arr[] = {3,5,2,1,8};
		calc.test2(arr);

		System.out.println(a);
		System.out.println(Arrays.toString(arr));
		
//		int a = calc.sum2(1, 2);//변수선언, 메소드호출
//		double e = calc.sum2(173.8, 12.5);
//		System.out.println(a);
//		System.out.println(e);
//
//
//		int b = calc.max(1, 5);
//		System.out.println(b);
//
//		int c = calc.abs(-6);
//		System.out.println(c);
//		
//		int d = calc.min(50, 20, 1);
//		System.out.println(d);
//		
//		int arr[] = {3,5,2,1,8};
//		
//		int max = calc.arrMax(arr);
//		System.out.println(max);
//		double avg = calc.arrAvg(arr);
//		System.out.println(avg);
		
		
		
	}
}