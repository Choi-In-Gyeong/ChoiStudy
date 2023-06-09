package day0609;

import java.util.*;

public class _02_Collections {
	
	static void printList(ArrayList<Integer> l){
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {//������Ұ� �������� ���� boolean���� ��ȯ
			Integer n = it.next();
			String separator;
			if (it.hasNext()) {//������Ұ� �������� ���� boolean���� ��ȯ
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
		printList(list);//static���� ����Ǿ �޼ҵ� 
		
		Collections.reverse(list);
		printList(list);//static���� ����Ǿ �޼ҵ� 
		
		System.out.println("�Է��� �����߿� �ϳ��� �Է��ϼ���.");
//		int i = s.nextInt();
		int index = Collections.binarySearch(list, s.nextInt()) + 1;
		System.out.println("�Է��ϴ°��� " + index + "��°�� �ֽ��ϴ�.");//������ �����Ŀ� ���!
	}

}
