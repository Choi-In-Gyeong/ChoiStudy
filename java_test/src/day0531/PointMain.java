package day0531;

public class PointMain {

	public static void main(String[] args) {
//
		Point p = new Point(1,2); // Point ��ü ���� => ����Ʈ �����ڷ� ȣ��.
//		p.set(1, 2); // Point Ŭ������ set() ȣ�� =>set()�޼��� ������, ȣ��Ұ�.
		p.showPoint();//�ش� �޼��� ���ο��� ����Ʈ�� ����

		PointColor cp = new PointColor(1,2,"red"); // ColorPoint ��ü
//		cp.set(3, 4); // Point�� set() ȣ��
//		cp.setColor("red"); // ColorPoint�� setColor() ȣ��
		cp.showColorPoint(); 
		
	}

}
