package day0531;

public class Human {
	private String a;
	private String b;
	private String c;
	private int d;
	
	Human(){}
	
	Human (String a){
		this(a,"�˼�����","�˼�����",0);
	}
	Human (String a, String b){
		this(a,b,"�˼�����",0);

	}
	Human (String a, String b, String c){
		this(a,b,c,0);
	}
	Human (String a, String b, String c, int d){//main���� 4ĭ¥�� ������ �ʿ��ϹǷ� ������ 4ĭ¥�� �����, ���� ������ �ҷ�����
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public String toString(){//ObjectŬ������ �ִ� toString �޼��带 �������̵��̶� �θ𲨶� ���� ���������.
		return ("�̸��� " + a + ", �ּҴ� " + b + ", �ڵ�����ȣ�� " + c + "�Դϴ�.");
	}
}
