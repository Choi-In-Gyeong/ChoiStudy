package day0607;

import java.util.Vector;

class PrintVector {
	// Integer 벡터를 매개변수로 받아 원소를 모두 출력하는 printVector() 메소드
	public void printVector(Vector<Integer> v) {
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i); // 벡터의 i 번째 정수
			System.out.println(n);
		}
	}
}

public class _04_VectorString {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();

		v.add("홍길동");
		v.add("강호동");
		v.add("유재석");
		v.add("강호동");

		v.add(1, "박명수");
		v.remove("강호동");// v.remove(0);하면 0번째 삭제, 앞에 강호동만 삭제돼
		// v.remove(0);

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		Vector<Integer> vv = new Vector<Integer>(); // Integer 벡터 생성
//		printVector(vv); // 메소드 호출
	}
}
