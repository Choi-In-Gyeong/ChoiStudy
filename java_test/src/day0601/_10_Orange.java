package day0601;

public class _10_Orange extends _08_Fruit {
	private int price;

	public _10_Orange(String name, String color, int price) {
		super(name, color);
		this.price = price;
	}
	
	void view(){
		super.view();
		System.out.println(", АЁАн : " + price);

	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
