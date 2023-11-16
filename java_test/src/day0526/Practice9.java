package day0526;

public class Practice9 {

	public static void main(String[] args) {
		int a[] = {40,-20,-30,-10,50};
		
		int max = a[0];
		int min = Math.abs(a[0]);
		
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, Math.abs(a[i]));
			min = Math.min(min, Math.abs(a[i]));
		}
		
		System.out.println(max-min);
	}

}
// 오버라이딩 : 상속받은 메서드 재정의
// 오버로딩 : 동일한 클래스 내의 동일한 메서드의 다른 기능 구현 (변수 타입과 매개변수가 다름.)