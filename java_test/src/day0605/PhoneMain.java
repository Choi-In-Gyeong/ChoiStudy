package day0605;

public class PhoneMain {
	
	public static void main(String[] args) {
		PhoneInterface phone;
		SamsungPhone sPhone = new SamsungPhone();

		phone = sPhone;// ��ĳ���� , �������̽��� ���ǵ� �޼���� �Ӽ����� ���ٰ���
		
		sPhone = (SamsungPhone)phone;//�ٿ�ĳ����

	}

}
