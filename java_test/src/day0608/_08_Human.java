package day0608;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class _08_Human {
	
	private String name;
	private int age;
	private String addr;
	private int javaScore;
	
	public _08_Human(String a, int b, String c) {
		name = a;
		age = b;
		addr = c;
//		javaScore = d;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddr() {
		return addr;
	}
	
	
	public int getScore() {
		return javaScore;
	}
	public void setScore(int javaScore) {
		this.javaScore = javaScore;
	}
	public static void main(String[] args) {
		HashMap<String, _08_Human> map = new HashMap<String, _08_Human>();
		//��ü �����.
		_08_Human hong = new _08_Human("ȫ�浿" , 30, "����");
		
		map.put("ȫ�浿", hong);
		map.put("���ΰ�", new _08_Human("���ΰ�", 28, "��õ"));
		
//		_08_Human h = map.get("ȫ�浿");
		System.out.println(map.get("ȫ�浿").getAddr());
		
//		choi = map.get("���ΰ�");
//		hong = map.get("ȫ�浿");
		
//		map.get("���ΰ�").setScore(s.nextInt());
//		System.out.println("���ΰ��� ������ :" + map.get("���ΰ�").getScore());
//		
//		map.get("ȫ�浿").setScore(s.nextInt());
//		System.out.println("ȫ�浿�� ������  : " + map.get("ȫ�浿").getScore());
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}
