package day0605;

public class _03_SamsungPhone implements _02_PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("띠리리리리링~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}


}
