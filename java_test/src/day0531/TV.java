package day0531;

public class TV {
	private String a;
	private int b;
	private int c; 
	//�����ڻ����ڻ����� �Ű������������� ������...���ڼ���... �����ڸ� 3���޾ƾ߰ڴ�.
	TV(String a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void show(){
		System.out.println(a + "���� ���� " + b + "���� " + c + "��ġ TV");
	}
}
