package day0525;

public class Sample {

	public static void main(String[] args) {

		String name = "ȫ�浿";
		int age = 30;
		double height = 170.5;
		double weight = 60.1;
		
		boolean flg = true; // true or false
		// ������ �̰� 4���� �˾Ƶ���.

		if (height > 180) {
			System.out.println("Ű�� 180�̻� �Դϴ�.");
		}else {
			System.out.println("Ű�� 180���� �Դϴ�.");
		}
		
		if (flg) {
			System.out.println("����");
		}
		flg = false;
		
		if (flg) {
			System.out.println("����");
		}
		

		if (height >= 180) {
			System.out.println("Ű�� 180�̻� �Դϴ�.");
		}else if (height >= 170) {
			System.out.println("Ű�� 170�̻� �Դϴ�.");
		}else if (height >= 160) {
			System.out.println("Ű�� 160�̻� �Դϴ�.");
		}
		
		if (height >= 180 || weight >= 60) {
			System.out.println("���");//�����ϳ��� ���̸� ��µ�.
		}
		
		
		
		
		
	}
}
