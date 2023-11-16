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
		//객체 만들기.
		_08_Human hong = new _08_Human("홍길동" , 30, "서울");
		
		map.put("홍길동", hong);
		map.put("최인경", new _08_Human("최인경", 28, "인천"));
		
//		_08_Human h = map.get("홍길동");
		System.out.println(map.get("홍길동").getAddr());
		
//		choi = map.get("최인경");
//		hong = map.get("홍길동");
		
//		map.get("최인경").setScore(s.nextInt());
//		System.out.println("최인경의 점수는 :" + map.get("최인경").getScore());
//		
//		map.get("홍길동").setScore(s.nextInt());
//		System.out.println("홍길동의 점수는  : " + map.get("홍길동").getScore());
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		

	}

}
