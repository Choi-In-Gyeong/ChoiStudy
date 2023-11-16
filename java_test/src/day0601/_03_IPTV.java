package day0601;

public class _03_IPTV extends _02_ColorTV{
	private String ip;

	public _03_IPTV(String ip, int size, int color){
		super(size, color);
		this.ip = ip;
	}
	
	void printProperty(){
		System.out.print("나의 IPTV는 " + ip + "주소의 ");
		super.printProperty();//수퍼클래스 메서드불러오는 함수.
	}
	
}
