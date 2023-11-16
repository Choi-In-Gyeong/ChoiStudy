package day0531;

public class PointMain {

	public static void main(String[] args) {
//
		Point p = new Point(1,2); // Point 객체 생성 => 디폴트 생성자로 호출.
//		p.set(1, 2); // Point 클래스의 set() 호출 =>set()메서드 없으면, 호출불가.
		p.showPoint();//해당 메서드 내부에서 프린트물 동작

		PointColor cp = new PointColor(1,2,"red"); // ColorPoint 객체
//		cp.set(3, 4); // Point의 set() 호출
//		cp.setColor("red"); // ColorPoint의 setColor() 호출
		cp.showColorPoint(); 
		
	}

}
