package day0605;

import java.util.Arrays;

public class _09_ArrayInterface {

	public static void main(String[] args) {
		_08_ArrayInterface arr;//2개
		ArrayInterface ar = new ArrayInterface();//5개
		
//		ar = (ArrayInterface) arr;
		arr = ar;//업캐스팅, 인터페이스에 정의된 메서드와 속성에만 접근가능. => 사용할 수 잇는 멤버가 2개에서 5개로 늘음.
		ar = (ArrayInterface)arr;//2개짜리 리모콘이 되었기 때문에, 5개
		
		int[] a = { 3, 5, 2, 4, 1 };
		ar.MaxSubMin(a);
		ar.MaxChange(a);
	}
}
class ArrayInterface implements _08_ArrayInterface {

	@Override
	public void MaxSubMin(int[] a) {
		int max = 0;//index값
		int min = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[max] < a[i]) {
				max = i;
			} else if (a[min] > a[i]) {
				min = i;
			}
		}
		System.out.println(a[max] - a[min]);
	}

	@Override
	public void MaxChange(int[] a) {
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[max] < a[i]) {
				max = i;
			}
		}
		int temp = a[max];
		a[max] = a[a.length-1];
		a[a.length-1] = temp;
		System.out.println(Arrays.toString(a));
	}
}
