package day0526;

public class Practice9 {

	public static void main(String[] args) {
		int a[] = {40,-20,-30,-10,50};
		
		int max = a[0];
		int min = Math.abs(a[0]);
		
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, Math.abs(a[i]));
			min = Math.min(min, Math.abs(a[i]));
		}
		
		System.out.println(max-min);
	}

}
// �������̵� : ��ӹ��� �޼��� ������
// �����ε� : ������ Ŭ���� ���� ������ �޼����� �ٸ� ��� ���� (���� Ÿ�԰� �Ű������� �ٸ�.)