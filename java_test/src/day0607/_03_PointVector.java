package day0607;

import java.util.Vector;

class Point {
	private int x, y;

	public Point(int x, int y) {//생성자
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class _03_PointVector {
	public static void main(String[] args) {

		// Point 객체를 요소로만 가지는 벡터 생성
		Vector<Point> v = new Vector<Point>();//Integer String도 클래스니까. Point클래스도 사용가능.
		
		// 3 개의 Point 객체 삽입
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));//remove를 통해 삭제 
		v.add(new Point(10, 100));
		v.add(new Point(30, -8));
		v.remove(1); // 인덱스 1의 Point(-5, 20) 객체 삭제
		
		// 벡터에 있는 Point 객체 모두 검색하여 출력
		for (int i = 0; i < v.size(); i++) {// 벡터에서 i 번째 Point 객체 얻어내기
			Point p =  v.get(i);
			System.out.println("[" + i + "]: " + p); // p.toString()을 이용하여 객체 p 출력
			//toString의 특징 그냥 객체명 p만 넣어도 리턴값 출력.
		}

	}

}
