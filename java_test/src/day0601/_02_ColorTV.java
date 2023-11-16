package day0601;

public class _02_ColorTV extends _01_TV{
	private int color;
	
	public _02_ColorTV(int size, int color){
		super(size);
		this.color = color;
	}
//	
//	protected int getColor() {
//		return color;
//	}

	void printProperty(){
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
	
	

}
