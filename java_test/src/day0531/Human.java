package day0531;

public class Human {
	private String a;
	private String b;
	private String c;
	private int d;
	
	Human(){}
	
	Human (String a){
		this(a,"알수없음","알수없음",0);
	}
	Human (String a, String b){
		this(a,b,"알수없음",0);

	}
	Human (String a, String b, String c){
		this(a,b,c,0);
	}
	Human (String a, String b, String c, int d){//main에서 4칸짜리 변수가 필요하므로 생성자 4칸짜리 만들고, 위에 생성자 불러오기
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public String toString(){//Object클래스에 있는 toString 메서드를 오버라이딩이라서 부모꺼랑 형태 맞춰줘야함.
		return ("이름은 " + a + ", 주소는 " + b + ", 핸드폰번호는 " + c + "입니다.");
	}
}
