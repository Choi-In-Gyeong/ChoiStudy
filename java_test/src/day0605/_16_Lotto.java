package day0605;
// 로또 : 1~45 중 6개 
//int a = (int)(Math.random()*((큰수-작은수)+1) +1)
public class _16_Lotto {
	public static void main(String[] args) {
		
		int lotto[] = new int [6];//배열선언, 생성
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			//중복 값 해결
			for (int j = 0; j < i; j++) {
				if (lotto[i]==lotto[j]) {//같은 값이 있으면
					i--;//지금 발생한 값 무효화 //ex) 3번째에서 중복값이 나온다면 3번째 없애고 다시 위에 for가서 i++해서 다시 3번째 실행
					break;//inner-for 블럭 탈출
				}//if-end
			}//inner-for
		}//out-for
		
		//출력
		for (int i = 0; i < 6 ; i++) {//배열은 0부터니까 조건에 =추가 안함
			System.out.println(lotto[i] + " ");
		}
//		System.out.println();//줄바꿈
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
