package day0525;

public class Sample {

	public static void main(String[] args) {

		String name = "홍길동";
		int age = 30;
		double height = 170.5;
		double weight = 60.1;
		
		boolean flg = true; // true or false
		// 변수는 이거 4개만 알아도됨.

		if (height > 180) {
			System.out.println("키가 180이상 입니다.");
		}else {
			System.out.println("키가 180이하 입니다.");
		}
		
		if (flg) {
			System.out.println("실행");
		}
		flg = false;
		
		if (flg) {
			System.out.println("실행");
		}
		

		if (height >= 180) {
			System.out.println("키가 180이상 입니다.");
		}else if (height >= 170) {
			System.out.println("키가 170이상 입니다.");
		}else if (height >= 160) {
			System.out.println("키가 160이상 입니다.");
		}
		
		if (height >= 180 || weight >= 60) {
			System.out.println("출력");//둘중하나만 참이면 출력됨.
		}
		
		
		
		
		
	}
}
