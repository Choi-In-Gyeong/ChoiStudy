package day0531;

public class Point {
	private int x;
	private int y;
	
//	Point (){} //����Ʈ������.
	
	Point (int x, int y) {//��ü�����Ҷ� �Ű������Է��ϸ�, set�޼ҵ尡 �ʿ䰡����.
		this.x = x;
		this.y = y;
	}

	void showPoint () { //�Ű����� �޴°� ������ ����.
		System.out.println(("(" + x + "," + y + ")"));
	}
	
	
	
}
