package day0605;

import day0605._02_PhoneInterface;
import day0605._03_SamsungPhone;

public class _04_PhoneMain {
	
	public static void main(String[] args) {
		_02_PhoneInterface phone;
		_03_SamsungPhone sPhone = new _03_SamsungPhone();

		phone = sPhone;// ��ĳ���� , �������̽��� ���ǵ� �޼���� �Ӽ����� ���ٰ���
		
		sPhone = (_03_SamsungPhone)phone;//�ٿ�ĳ����
		
		sPhone.receiveCall();
	}

}
