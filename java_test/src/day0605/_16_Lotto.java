package day0605;
// �ζ� : 1~45 �� 6�� 
//int a = (int)(Math.random()*((ū��-������)+1) +1)
public class _16_Lotto {
	public static void main(String[] args) {
		
		int lotto[] = new int [6];//�迭����, ����
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			//�ߺ� �� �ذ�
			for (int j = 0; j < i; j++) {
				if (lotto[i]==lotto[j]) {//���� ���� ������
					i--;//���� �߻��� �� ��ȿȭ //ex) 3��°���� �ߺ����� ���´ٸ� 3��° ���ְ� �ٽ� ���� for���� i++�ؼ� �ٽ� 3��° ����
					break;//inner-for �� Ż��
				}//if-end
			}//inner-for
		}//out-for
		
		//���
		for (int i = 0; i < 6 ; i++) {//�迭�� 0���ʹϱ� ���ǿ� =�߰� ����
			System.out.println(lotto[i] + " ");
		}
//		System.out.println();//�ٹٲ�
//		
//		int lt[] = new int [6];
//		
//		for (int i = 0; i < 6; i++) {
//			lt[i] = (int)(Math.random()*45+1);
//			
//			for (int j = 0; j < i; j++) {
//				if (lt[i]==lt[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		for (int i = 0; i < 6; i++) {
//			System.out.println(lt[i] + "  ");
//		}

	}

}
