package day0531;

public class ColorTV2 extends ColorTV1{
	private int Color;
	
//	public ColorTV2() {
//		System.out.println("ColorTV2 �⺻������");
//	}
	public ColorTV2(int size, int Color) {
		super(size);
		this.Color = Color;

//		System.out.println("ColorTV2 �Ű����� ������");
	}
	
//	void setColor (int Color){
//		this.Color = Color;
//	}
	
	void printProperty (){
		System.out.println(getSize() + "��ġ " + Color + "�÷�");
	}
	

	

}
