package day0605;

public class _04_PhoneMain {
	
	public static void main(String[] args) {
		_02_PhoneInterface phone;
		_02_SamsungPhone sPhone = new _02_SamsungPhone();

		phone = sPhone;// ��ĳ���� , �������̽��� ���ǵ� �޼���� �Ӽ����� ���ٰ���
		
		sPhone = (_02_SamsungPhone)phone;//�ٿ�ĳ����

	}

}
