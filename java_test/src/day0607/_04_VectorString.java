package day0607;

import java.util.Vector;

class PrintVector {
	// Integer ���͸� �Ű������� �޾� ���Ҹ� ��� ����ϴ� printVector() �޼ҵ�
	public void printVector(Vector<Integer> v) {
		for (int i = 0; i < v.size(); i++) {
			int n = v.get(i); // ������ i ��° ����
			System.out.println(n);
		}
	}
}

public class _04_VectorString {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();

		v.add("ȫ�浿");
		v.add("��ȣ��");
		v.add("���缮");
		v.add("��ȣ��");

		v.add(1, "�ڸ��");
		v.remove("��ȣ��");// v.remove(0);�ϸ� 0��° ����, �տ� ��ȣ���� ������
		// v.remove(0);

		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		Vector<Integer> vv = new Vector<Integer>(); // Integer ���� ����
//		printVector(vv); // �޼ҵ� ȣ��
	}
}
