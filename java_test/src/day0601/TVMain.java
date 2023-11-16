package day0601;

public class TVMain {

	public static void main(String[] args) {

		_02_ColorTV myTV = new _02_ColorTV(32, 1024);
		myTV.printProperty();

		_03_IPTV iptv = new _03_IPTV("192.1.1.2", 32, 2048); // 나의 IPTV는 "192.1.1.2" 주소에 32인치,2048컬러
		iptv.printProperty();// 부모 메서드 이름 오버라이딩 할때.

	}

}
