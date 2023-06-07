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

		MyClass<String> s = new MyClass<String>(); // ���׸� Ÿ�� T�� String ����
		s.set("hello");
		System.out.println(s.get()); // "hello" ���
		MyClass<Integer> n = new MyClass<Integer>(); // ���׸� Ÿ�� T�� Integer ����
		n.set(5);
		System.out.println(n.get()); // ���� 5 ���

	}

}
