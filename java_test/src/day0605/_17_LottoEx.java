package day0605;
//int a = (int)(Math.random()*(Å«¼ö-ÀÛÀº¼ö)+1)+1)
public class _17_LottoEx {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*(45-1+1)+1);
			
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
			
		}

	}
}
