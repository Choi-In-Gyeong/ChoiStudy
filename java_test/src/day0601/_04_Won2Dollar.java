package day0601;


public class _04_Won2Dollar {
	int won;
	private int dollar;
	
	_04_Won2Dollar(int dollar){
		this.dollar = dollar;
	}
	
	void run(){
		
		System.out.println("변환 결과: " + (double)(won/dollar) +"달러입니다");
		
		
	}

}
