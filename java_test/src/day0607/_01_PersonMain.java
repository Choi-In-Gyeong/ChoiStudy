package day0607;

class Person{
	void talk(){
		System.out.println("���ϱ�");
	}
	void eat(){
		System.out.println("�Ա�");

	}
	void walk(){
		System.out.println("�ȱ�");

	}
	void sleep(){
		System.out.println("���ڱ�");
	}
	
}

class Student extends Person{
	private int stuNum;
	
	void eat(){
		System.out.println("�н� �Ա�");

	}
	void study(){
		System.out.println("�����ϱ�");
	}
}

class StudentWorker extends Student {
	
	private int empNum;
	
	void work(){
		System.out.println("���ϱ�");
	}
}

class Researcher extends Person{
	void research(){
		System.out.println("�����ϱ�");
	}
}

class Professor extends Researcher{
	void teach(){
		System.out.println("����ġ��");
	}
}

public class _01_PersonMain {
	//Person�� ��ӹ޾Ƽ� ������� Ŭ�������� ��ü�� �Ű������� �޴� �޼��� ȣ��.
	static void info (Person p){
		
		if (p instanceof StudentWorker) {
			System.out.println("�������Դϴ�.");
			((StudentWorker) p).work();
			System.out.println("---------------------");
		}else if (p instanceof Student) {
			System.out.println("�л��Դϴ�.");
			Student obj = (Student)p;
			obj.study();
			System.out.println("---------------------");
		}else if (p instanceof Professor){
			System.out.println("�����Դϴ�.");
			((Professor) p).teach();
			System.out.println("---------------------");
		}else if (p instanceof Researcher) {
			System.out.println("�������Դϴ�.");
			((Researcher) p).research();
			System.out.println("---------------------");
		}
	}
	
	public static void main(String[] args) {
		Person s = new Student();
		Person w = new StudentWorker();
//		Person p = s;//��ĳ����
//		s = (Student) p;//�ٿ�ĳ����
		
		Person r = new Researcher();
		s.eat();//��ĳ����
		System.out.println("---------------------");

		Object obj = new Professor();
//		new _01_PersonMain().info(new Researcher());
		info(s);
		info(w);
		info(r);
		info(new Professor());
		
	}

}
