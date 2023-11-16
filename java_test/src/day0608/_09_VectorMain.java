package day0608;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class _09_VectorMain {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		
//		for (int i = 0; i < v.size(); i++) {
//			System.out.print(v.get(i) + " ");
//		}
		
		System.out.println("\n------------------------------------");
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) { // 모든 요소 방문
			System.out.println(it.next());
//			int n = it.next(); // 다음 요소 리턴
		}
		Scanner s = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			a.add(s.next());
		}
		
		System.out.println("\n------------------------------------");

		Iterator<String> i = a.iterator();
		while (i.hasNext()) { // 모든 요소 방문
			System.out.println(i.next());
		}
	}

}
