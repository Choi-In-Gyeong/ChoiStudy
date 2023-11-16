package day0605;

public class _13_PointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			_12_Point p = new _12_Point(2, 3);
			System.out.println(p.getClass().getName()); // 클래스 이름
			System.out.println(p.getClass().getSimpleName()); //패키지 이름 제외한 클래스 이름
			System.out.println(p.hashCode()); // 해시 코드 값
			
			
			System.out.println(p.toString()); // 객체를 문자열로 만들어 출력 toString은 생략가능.
			System.out.println(p); // 객체 출력 toString 생략되어있음.
			
			_12_Point p1 = new _12_Point(4,3);
			_12_Point p2 = new _12_Point(1,6);
			
			System.out.println(p1==p2);// 주소값이 다름.
			System.out.println(p1.equals(p2));
			
			
	}

}
