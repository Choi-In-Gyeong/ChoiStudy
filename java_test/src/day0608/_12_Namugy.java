package day0608;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class _12_Namugy {
	private String name;
	private int age;
	private String addr;
	

	public _12_Namugy(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
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

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		HashMap<String, _12_Namugy> m = new HashMap<>();//스캐너선언후 해시맵(클래스 밸류값으로)선언
		
		while (true) {
			System.out.println("한개선택 ㄱㄱ");
			System.out.print("(1)입력, (2)삭제, (3)출력, (4)종료");
			int a = s.nextInt();//와일문 만들고  숫자 입력받는거
			
			if (a==1) {
				System.out.println("이름 나이 주소 입력하세용");
				String name = s.next();
				int age = s.nextInt();
				String addr = s.next();//요까지 1번누르고 데이터 입력받는거
				
				_12_Namugy p = new _12_Namugy(name, age, addr);// 입력받은 값  생성자로 입력해서 객체생성
				
				m.put(name, p);//해시맵안에 이프문안에 선언된 입력받은 name으로  키값받고 객체 p를 밸류값으로 해시맵에 저장
			}else if (a==2) {
				System.out.println("삭제할 사용자 이름 입력 >> ");
				String name = s.next();
				if (m.containsKey(name)) {//지정된 키를 포함하고잇으면 true리턴
					m.remove(name);
				}
				
			}else if (a==3) {
				Set<String> keys = m.keySet();//해시맵의 모든 키를 담은 키컬렉션 리턴
			//  키가 스트링이므로/변수이름  /키컬렉션리턴하는 메서드
				
				Iterator<String> it = keys.iterator();
				while (it.hasNext()) {
					_12_Namugy n = m.get(it.next());
					System.out.println(n.getName());
					System.out.println(n.getAge());
					System.out.println(n.getAddr());
				}
				
			}else if (a==4) 
				break;
		}
	
	}

}



