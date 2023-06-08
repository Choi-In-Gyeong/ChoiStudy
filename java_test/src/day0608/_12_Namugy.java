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
		HashMap<String, _12_Namugy> m = new HashMap<>();//��ĳ�ʼ����� �ؽø�(Ŭ���� ���������)����
		
		while (true) {
			System.out.println("�Ѱ����� ����");
			System.out.print("(1)�Է�, (2)����, (3)���, (4)����");
			int a = s.nextInt();//���Ϲ� �����  ���� �Է¹޴°�
			
			if (a==1) {
				System.out.println("�̸� ���� �ּ� �Է��ϼ���");
				String name = s.next();
				int age = s.nextInt();
				String addr = s.next();//����� 1�������� ������ �Է¹޴°�
				
				_12_Namugy p = new _12_Namugy(name, age, addr);// �Է¹��� ��  �����ڷ� �Է��ؼ� ��ü����
				
				m.put(name, p);//�ؽøʾȿ� �������ȿ� ����� �Է¹��� name����  Ű���ް� ��ü p�� ��������� �ؽøʿ� ����
			}else if (a==2) {
				System.out.println("������ ����� �̸� �Է� >> ");
				String name = s.next();
				if (m.containsKey(name)) {//������ Ű�� �����ϰ������� true����
					m.remove(name);
				}
				
			}else if (a==3) {
				Set<String> keys = m.keySet();//�ؽø��� ��� Ű�� ���� Ű�÷��� ����
			//  Ű�� ��Ʈ���̹Ƿ�/�����̸�  /Ű�÷��Ǹ����ϴ� �޼���
				
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



