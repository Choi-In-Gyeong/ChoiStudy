package day0605;

public class _11_Calc {

	public static void main(String[] args) {
		
//		Calc c = new Calc();
		System.out.println(new Calc().Add(20, 20));
		System.out.println(new Calc().Sub(20, 20));
		System.out.println(new Calc().Mul(20, 20));
		System.out.println(new Calc().Div(20, 20));
	}
}

class Calc implements _10_CalcInterface{

	@Override
	public int Add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int Sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int Mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int Div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}
