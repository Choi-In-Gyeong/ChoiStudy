package day0601;

public class _08_Fruit {
	private String name;
	private String color;

	_08_Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	void view(){
		System.out.print("����  : " + name + ", ���� : " + color);
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;

	}

}
