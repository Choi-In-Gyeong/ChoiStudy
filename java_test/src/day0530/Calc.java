package day0530;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Calc {
	void sum() {
		System.out.println("void sum ȣ��");
	}
	int sum2(int a, int b) {
		return a + b;// �������� �����̱� ������
	}
	double sum2(double a, double b){
		return a + b;
	}
	int max(int c, int d) {
		// int e = 0;
		// if (c>=d) {
		// e = c;
		// } else {
		// e = d;
		// }
		// return e;
		return (c >= d) ? c : d;// ���׿�����
	}

	int abs(int a) {
//		int b = 0;
//		if (a >= 0) {
//			b = a;
//		} else {
//			b = -a;
//		}
//		return b;
		return  (a>=0) ? a : -a;
	}
	//�ΰ� �� �ּڰ�
	int min (int a, int b){
		return (a>=b) ? b : a;
	}
	//3�� �� �ּڰ�
	int min (int a, int b, int c){
		int x = (a >= b) ? b : a;
		return (x >= c) ? c : x;
		
	}
	
	int arrMax(int arr[]){
		int max = arr[0];
		for(int num : arr){
			max = Math.max(max, num);
		}
		return max;
	}
	
	double arrAvg(int arr[]){//��� �� ���ؼ� ������ ������
		double sum = 0;
		for (double num : arr){
			sum += num;
		}
		return (double)sum/arr.length;
	}
//	----------------------------------------------
	void test1(int a){
		a = a + 1;
	}
	
	void test2(int arr[]){
		arr[0] = 100;
	}
	

}

