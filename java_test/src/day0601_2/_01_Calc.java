package day0601_2;

import java.util.Arrays;

public class _01_Calc {

	void message(){
		System.out.println("안녕하세요.");
	}
	
	String message2(){
		return "안녕하세요!";
	}
	
	void sum(int a, int b){
		System.out.println(a + b);
	}
	
	int sum2 (int a, int b){
		return a + b;
	} 
	
	double sum2 (double a, double b){
		return a + b;
	}
	
	void max (int a, int b){
		System.out.println("큰 수는 " + Math.max(a, b) + "입니다.");
	}
	
	void arr1(int arr[]) {
		int minindex = 0;
		int maxindex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[maxindex]) {
				maxindex = i;
			}
			if (arr[minindex] > arr[i]) {
				minindex = i;
			}
		}
		int temp = arr[maxindex];
		arr[maxindex] = arr[minindex];
		arr[minindex] = temp;
	}
	
	void arr2(int arr[]){
		//{3,4,6,5,2} arr[minindex] <> arr[4]
		int minindex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[minindex] > arr[i]) {
				minindex = i;
			}
		}
		int temp = arr[minindex];
		arr[minindex] = arr[arr.length-1];
		arr[arr.length-1] = temp;
	}
}
