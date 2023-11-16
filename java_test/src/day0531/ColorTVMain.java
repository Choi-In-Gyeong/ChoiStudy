package day0531;

public class ColorTVMain {

	public static void main(String[] args) {
		ColorTV2 myTV = new ColorTV2(32,1024);
		
//		myTV.setSize(32);
//		myTV.setColor(1024);//get굳이 필요없음. 프린트하는 클래스내에서 사용
		myTV.printProperty();
	}

}
