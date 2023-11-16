package day0531;

public class PointColor extends Point {
	private String color;

	PointColor (int x, int y, String color){
		super(x,y);
		this.color = color;
	}
	void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
