package day0605;

abstract class _01_Calculator {
	
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}
class GoodCalc extends _01_Calculator{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		for (int num : a){//int num = 0; 따로 안해도된다.
			sum += num;
		}
		return (double)sum/a.length;
		
	}
	
}