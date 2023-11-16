package day0601_2;

import java.util.Arrays;
//import java.util.Scanner;


public class _02_CalcMain {

	public static void main(String[] args) {
		_01_Calc calc = new _01_Calc();
		calc.message();//message()에서 프린트
		
		System.out.println(calc.message2());//main창에서 프린트

		calc.sum(1,2);//sum()에서 프린트
		
		int a = calc.sum2(3,4);//main 창에서 변수 a선언해서 프린트
		System.out.println(a);
		
		double b = calc.sum2(1, 2.5);//오버로딩 : 변수개수와 , 자료형 종류가 다르면 가능.
		System.out.println(b);
		
//		Scanner s = new Scanner(System.in);
//		int c = s.nextInt();
//		int d = s.nextInt();
//		calc.max(c,d);//c,d로 선언하는 이유는 위에서 a,b가 선언되었기 때문인가..?
//		s.close();
		
		int arr[] = {3, 2, 6, 5, 4};
//		calc.arr1(arr); 
//		System.out.println(Arrays.toString(arr));
////		배열 내 가장 작은 숫자와 가장 큰 숫자 바꾸기 {3,6,2,5,4}

		calc.arr2(arr); 
		System.out.println(Arrays.toString(arr));
//		배열 내 가장 작은 숫자와 마지막 배열 숫자 바꾸기 {3,4,6,5,2} arr[2] <> arr[4]

		

	}

}
