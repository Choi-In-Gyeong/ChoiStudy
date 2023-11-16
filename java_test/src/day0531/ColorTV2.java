package day0531;

public class ColorTV2 extends ColorTV1{
	private int Color;
	
//	public ColorTV2() {
//		System.out.println("ColorTV2 기본생성자");
//	}
	public ColorTV2(int size, int Color) {
		super(size);
		this.Color = Color;

//		System.out.println("ColorTV2 매개변수 생성자");
	}
	
//	void setColor (int Color){
//		this.Color = Color;
//	}
	
	void printProperty (){
		System.out.println(getSize() + "인치 " + Color + "컬러");
	}
	

	

}
