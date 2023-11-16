package day0531;

public class TV {
	private String a;
	private int b;
	private int c; 
	//생성자생성자생성자 매개변수를가지는 생성자...성자성자... 생성자를 3개받아야겠다.
	TV(String a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void show(){
		System.out.println(a + "에서 만든 " + b + "년형 " + c + "인치 TV");
	}
}
