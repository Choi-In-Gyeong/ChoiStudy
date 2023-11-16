package day0605;

import day0605._02_PhoneInterface;
import day0605._03_SamsungPhone;

public class _04_PhoneMain {
	
	public static void main(String[] args) {
		_02_PhoneInterface phone;
		_03_SamsungPhone sPhone = new _03_SamsungPhone();

		phone = sPhone;// 업캐스팅 , 인터페이스에 정의된 메서드와 속성에만 접근가능
		
		sPhone = (_03_SamsungPhone)phone;//다운캐스팅
		
		sPhone.receiveCall();
	}

}
