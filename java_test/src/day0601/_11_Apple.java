package day0601;

public class _11_Apple extends _08_Fruit{
	private int price;

	public _11_Apple(String name, String color, int price) {
		super(name, color);
		this.price = price;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
