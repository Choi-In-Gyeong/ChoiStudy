package day0526;

public class Practice8 {

	public static void main(String[] args) {

		int arr[] = {15, 22, 33, 50, 19, 2};
		int oddSum = 0;
		int evenSum = 0;
		int oddCnt = 0;
		int evenCnt = 0;
		for(int num : arr){
			if(num % 2 == 0){
				evenSum += num;
				evenCnt++;
			} else {
				oddSum += num;
				oddCnt++;
			}
		}
		System.out.println("Â¦¼ö Æò±Õ : " + (double)evenSum / evenCnt);
		System.out.println("È¦¼ö Æò±Õ : " + (double)oddSum / oddCnt);
	}
}
