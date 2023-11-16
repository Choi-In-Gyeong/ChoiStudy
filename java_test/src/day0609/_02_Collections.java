package day0609;

import java.util.*;

public class _02_Collections {
	
	static void printList(ArrayList<Integer> l){
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {//다음요소가 있을때의 조건 boolean으로 반환
			Integer n = it.next();
			String separator;
			if (it.hasNext()) {//다음요소가 있을때의 조건 boolean으로 반환
				separator = "->";
			}else
				separator = "\n";
			System.out.print(n + separator);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			list.add(s.nextInt());
		}
		
		Collections.sort(list);
		printList(list);//static으로 선언되어서 메소드 
		
		Collections.reverse(list);
		printList(list);//static으로 선언되어서 메소드 
		
		System.out.println("입력한 숫자중에 하나만 입력하세요.");
//		int i = s.nextInt();
		int index = Collections.binarySearch(list, s.nextInt()) + 1;
		System.out.println("입력하는값은 " + index + "번째에 있습니다.");//정렬을 한이후에 사용!
	}

}
