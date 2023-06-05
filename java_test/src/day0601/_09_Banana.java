package day0601;

public class _09_Banana extends _08_Fruit{
	private int price;
	
	public _09_Banana(String name, String color, int price) {
		super(name, color);
		this.price = price;
	}
	
	void view(){
		System.out.print("�����̰� �����ϴ� �ٳ��� ==> ");
		super.view();
		System.out.print("\n");
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
