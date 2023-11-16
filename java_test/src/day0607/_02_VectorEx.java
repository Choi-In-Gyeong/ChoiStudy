package day0607;

import java.util.Vector;

public class _02_VectorEx {

	public static void main(String[] args) {
		
		Vector <Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		//���� �߰��� �����ϱ�
		v.add(2,100);

		System.out.println("���� ���� ��� ��ü �� " + v.size());
		System.out.println("������ ���� �뷮 " + v.capacity());//���� ������ 10
		
		//����� ���� ���
		for (int i = 0; i < v.size(); i++) {//�迭�� �� ����. v.size() = 4  0,1,2,3
			System.out.print("[" + i + ": " + v.get(i) + "], " );
		}
		
		System.out.println();
		
		//���� ���� ��� ���� ���ϱ�
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			sum += v.elementAt(i);
		}
		
		System.out.println("���� ���� ������ �� " + sum);
	}

}
