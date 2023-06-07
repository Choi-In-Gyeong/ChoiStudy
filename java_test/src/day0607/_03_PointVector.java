package day0607;

import java.util.Vector;

class Point {
	private int x, y;

	public Point(int x, int y) {//������
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class _03_PointVector {
	public static void main(String[] args) {

		// Point ��ü�� ��ҷθ� ������ ���� ����
		Vector<Point> v = new Vector<Point>();//Integer String�� Ŭ�����ϱ�. PointŬ������ ��밡��.
		
		// 3 ���� Point ��ü ����
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));//remove�� ���� ���� 
		v.add(new Point(10, 100));
		v.add(new Point(30, -8));
		v.remove(1); // �ε��� 1�� Point(-5, 20) ��ü ����
		
		// ���Ϳ� �ִ� Point ��ü ��� �˻��Ͽ� ���
		for (int i = 0; i < v.size(); i++) {// ���Ϳ��� i ��° Point ��ü ����
			Point p =  v.get(i);
			System.out.println("[" + i + "]: " + p); // p.toString()�� �̿��Ͽ� ��ü p ���
			//toString�� Ư¡ �׳� ��ü�� p�� �־ ���ϰ� ���.
		}

	}

}
