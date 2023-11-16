package day0607;

import java.util.Vector;

public class _02_VectorEx {

	public static void main(String[] args) {
		
		Vector <Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		//벡터 중간에 삽입하기
		v.add(2,100);

		System.out.println("벡터 내의 요소 객체 수 " + v.size());
		System.out.println("벡터의 현재 용량 " + v.capacity());//현재 사이즈 10
		
		//모든요소 정수 출력
		for (int i = 0; i < v.size(); i++) {//배열의 총 길이. v.size() = 4  0,1,2,3
			System.out.print("[" + i + ": " + v.get(i) + "], " );
		}
		
		System.out.println();
		
		//벡터 속의 모든 정수 더하기
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			sum += v.elementAt(i);
		}
		
		System.out.println("벡터 내의 정수의 합 " + sum);
	}

}
