package day0609;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class _09_MethodTest {

	String a;
	ArrayList<Integer> b;
	int[] arr;

	public _09_MethodTest(String a, int java, int oracle, int html) {

		this.a = a;

		b = new ArrayList<Integer>();
		b.add(java);
		b.add(oracle);
		b.add(html);

		arr = new int[3];
		arr[0] = java;
		arr[1] = oracle;
		arr[2] = html;

	}

	HashMap<String, Object> result() {// ��̸���Ʈ�� Ű���̾�� �ε��������� ����ؾ��ϴ´�, ���°��
										// �����ִ��� �˱� ���� �ؽø��� �̿���.
		HashMap<String, Object> map = new HashMap<>();
		map.put("a", a);
		map.put("b", b);
		map.put("arr", arr);

		return map;
	}

	public static void main(String[] args) {
		_09_MethodTest m = new _09_MethodTest("ȫ�浿", 100, 90, 80);

		HashMap<String, Object> map = m.result();
		System.out.println(map.get("a"));
		System.out.println(map.get("b"));
		// System.out.println(map.get("a"));
	}
}
