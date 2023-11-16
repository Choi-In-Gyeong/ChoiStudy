package day0601;

public class _12_FruitMain {

	static void pack(_08_Fruit f) {// ��ĳ����

		int price = 0;
		if (f instanceof _09_Banana) {
			_09_Banana obj = (_09_Banana) f;// �ٿ�ĳ����
			price = obj.getPrice();
			
		} else if (f instanceof _10_Orange) {
			_10_Orange obj = (_10_Orange) f;
			price = obj.getPrice();
			
		} else if (f instanceof _11_Apple) {
			_11_Apple obj = (_11_Apple) f;
			price = obj.getPrice();

		}
		System.out.println(price + "�� ¥�� " + f.getName() + "�� ��ҽ��ϴ�.");
	}

	public static void main(String[] args) {
		_09_Banana b = new _09_Banana("�ٳ���", "�����", 1000);
		_10_Orange o = new _10_Orange("������", "��Ȳ��", 2000);
		_11_Apple a = new _11_Apple("���", "������", 1500);
//		-------------------------------------------------
		
		pack(b);
		pack(o);
		pack(a); 
//		-------------------------------------------------

		b.view();
		o.view();
		a.view();
//		-------------------------------------------------

		System.out.println("\n"+"\"ȫ�浿\"");
		System.out.println("\"\\n�� �ٹٲ��̴�.\"");
//		-------------------------------------------------

		
	}
}