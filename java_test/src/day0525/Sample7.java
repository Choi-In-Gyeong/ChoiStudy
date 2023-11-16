package day0525;

public class Sample7 {

	public static void main(String[] args) {
		
//		***
//		*****
//		*
//		**
//		***
		
		int arr[] = {3,5,1,2,3};
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}//inner-for-end
			System.out.println();
		}//for-end

	}//main-end

}//class-end
