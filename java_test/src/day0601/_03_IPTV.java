package day0601;

public class _03_IPTV extends _02_ColorTV{
	private String ip;

	public _03_IPTV(String ip, int size, int color){
		super(size, color);
		this.ip = ip;
	}
	
	void printProperty(){
		System.out.print("���� IPTV�� " + ip + "�ּ��� ");
		super.printProperty();//����Ŭ���� �޼���ҷ����� �Լ�.
	}
	
}
