package day0601;

public class _12_FruitMain {

	static void pack(_08_Fruit f) {// 업캐스팅

		int price = 0;
		if (f instanceof _09_Banana) {
			_09_Banana obj = (_09_Banana) f;// 다운캐스팅
			price = obj.getPrice();
			
		} else if (f instanceof _10_Orange) {
			_10_Orange obj = (_10_Orange) f;
			price = obj.getPrice();
			
		} else if (f instanceof _11_Apple) {
			_11_Apple obj = (_11_Apple) f;
			price = obj.getPrice();

		}
		System.out.println(price + "원 짜리 " + f.getName() + "를 담았습니다.");
	}

	public static void main(String[] args) {
		_09_Banana b = new _09_Banana("바나나", "노란색", 1000);
		_10_Orange o = new _10_Orange("오렌지", "주황색", 2000);
		_11_Apple a = new _11_Apple("사과", "빨간색", 1500);
//		-------------------------------------------------
		
		pack(b);
		pack(o);
		pack(a); 
//		-------------------------------------------------

		b.view();
		o.view();
		a.view();
//		-------------------------------------------------

		System.out.println("\n"+"\"홍길동\"");
		System.out.println("\"\\n은 줄바꿈이다.\"");
//		-------------------------------------------------

		
	}
}