package day0605;

public class _13_PointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			_12_Point p = new _12_Point(2, 3);
			System.out.println(p.getClass().getName()); // Ŭ���� �̸�
			System.out.println(p.getClass().getSimpleName()); //��Ű�� �̸� ������ Ŭ���� �̸�
			System.out.println(p.hashCode()); // �ؽ� �ڵ� ��
			
			
			System.out.println(p.toString()); // ��ü�� ���ڿ��� ����� ��� toString�� ��������.
			System.out.println(p); // ��ü ��� toString �����Ǿ�����.
			
			_12_Point p1 = new _12_Point(4,3);
			_12_Point p2 = new _12_Point(1,6);
			
			System.out.println(p1==p2);// �ּҰ��� �ٸ�.
			System.out.println(p1.equals(p2));
			
			
	}

}
