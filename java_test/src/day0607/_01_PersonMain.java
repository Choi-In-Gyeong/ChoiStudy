package day0607;

class Person{
	void talk(){
		System.out.println("말하기");
	}
	void eat(){
		System.out.println("먹기");

	}
	void walk(){
		System.out.println("걷기");

	}
	void sleep(){
		System.out.println("잠자기");
	}
	
}

class Student extends Person{
	private int stuNum;
	
	void eat(){
		System.out.println("학식 먹기");

	}
	void study(){
		System.out.println("공부하기");
	}
}

class StudentWorker extends Student {
	
	private int empNum;
	
	void work(){
		System.out.println("일하기");
	}
}

class Researcher extends Person{
	void research(){
		System.out.println("연구하기");
	}
}

class Professor extends Researcher{
	void teach(){
		System.out.println("가르치기");
	}
}

public class _01_PersonMain {
	//Person을 상속받아서 만들어진 클래스들의 객체를 매개변수로 받는 메서드 호출.
	static void info (Person p){
		
		if (p instanceof StudentWorker) {
			System.out.println("직장인입니다.");
			((StudentWorker) p).work();
			System.out.println("---------------------");
		}else if (p instanceof Student) {
			System.out.println("학생입니다.");
			Student obj = (Student)p;
			obj.study();
			System.out.println("---------------------");
		}else if (p instanceof Professor){
			System.out.println("교수입니다.");
			((Professor) p).teach();
			System.out.println("---------------------");
		}else if (p instanceof Researcher) {
			System.out.println("연구원입니다.");
			((Researcher) p).research();
			System.out.println("---------------------");
		}
	}
	
	public static void main(String[] args) {
		Person s = new Student();
		Person w = new StudentWorker();
//		Person p = s;//업캐스팅
//		s = (Student) p;//다운캐스팅
		
		Person r = new Researcher();
		s.eat();//업캐스팅
		System.out.println("---------------------");

		Object obj = new Professor();
//		new _01_PersonMain().info(new Researcher());
		info(s);
		info(w);
		info(r);
		info(new Professor());
		
	}

}
