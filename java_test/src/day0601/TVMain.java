package day0601;

public class TVMain {

	public static void main(String[] args) {

		_02_ColorTV myTV = new _02_ColorTV(32, 1024);
		myTV.printProperty();

		_03_IPTV iptv = new _03_IPTV("192.1.1.2", 32, 2048); // ���� IPTV�� "192.1.1.2" �ּҿ� 32��ġ,2048�÷�
		iptv.printProperty();// �θ� �޼��� �̸� �������̵� �Ҷ�.

	}

}
