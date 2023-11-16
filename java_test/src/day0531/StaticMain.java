package day0531;

public class StaticMain {

	public static void main(String[] args) {
//		StaticSample.staticNum = 10;//static으로 만든 변수는 클래스명으로도 접근가능.
//		System.out.println(StaticSample.staticNum);
//		
//		StaticSample obj = new StaticSample();//non스태틱 변수 접근가능하려고, 객체생성.
//		obj.nonStaticNum = 20;
//		obj.staticNum = 30;
//		
//		System.out.println(StaticSample.staticNum);//클래스가 공유하고 있는 값이기 때문에 객체로 접근해서 변경하더라도 클래스로 접근해도 값이 바뀌어나옴.
//		System.out.println(obj.staticNum);//객체로접근
//		
//		StaticSample obj2 = new StaticSample();
//		obj2.staticNum = 100;//다른객체여도 스택틱 변수는 다른 객체명으로 접근해도 값이변경됨.
//		obj2.nonStaticNum = 200;
//		
//		System.out.println(StaticSample.staticNum);
//		System.out.println(obj.nonStaticNum);//다른객체명으로 변경해서 접근해도 기존 obj.논스태틱 변수는 값이 변경안됨.
//		
		System.out.println(Math.PI);//스태틱으로 선언되었기 때문에, "클래스.변수"로 가능


	}

}
