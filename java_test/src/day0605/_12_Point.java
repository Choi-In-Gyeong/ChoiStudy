package day0605;

public class _12_Point {
	private int x, y;

	public _12_Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "Point(" + x + "," + y + ")";//Object �θ�Ŭ������ toString�޼��带 �ڼ�Ŭ�������� ������
	}
	
	public boolean equals(Object p) {
		_12_Point obj = (_12_Point) p;
		if ((x+y) == (obj.x+obj.y)) return true;
		else return false;
	}
}
