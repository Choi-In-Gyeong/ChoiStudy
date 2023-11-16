package day0607;

class MyClass<T> {
	T val;

	void set(T a) {
		val = a;
	}

	T get() {
		return val;
	}
}

public class SelfStudy02 {

	public static void main(String[] args) {

		MyClass<String> s = new MyClass<String>(); // 제네릭 타입 T에 String 지정
		s.set("hello");
		System.out.println(s.get()); // "hello" 출력
		MyClass<Integer> n = new MyClass<Integer>(); // 제네릭 타입 T에 Integer 지정
		n.set(5);
		System.out.println(n.get()); // 숫자 5 출력

	}

}
