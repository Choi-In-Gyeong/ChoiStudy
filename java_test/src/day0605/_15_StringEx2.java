package day0605;

import java.util.Arrays;

public class _15_StringEx2 {
		public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a + "�� ���̴� " + a.length()); // ���ڿ��� ����(���� ����)
		
		System.out.println(a.contains("#")); // ���ڿ��� ���� ����
		
		a = a.concat(b); // ���ڿ� ����
		System.out.println(a);
		//a= C#,C++;
		
		a = a.trim(); // ���ڿ� �� ���� ���� ����
		System.out.println(a);
		//a =C#,C++
		
		a = a.replace("C#","Java"); // ���ڿ� ��ġ => �ڹٶ� c#�ٲ�.
		System.out.println(a);
		//a = Java,C++
		
		String s[] = a.split(","); // ���ڿ� �и�
		System.out.println(Arrays.toString(s));
		//s[] = [Java, C++]
		for (int i=0; i<s.length; i++)
		System.out.println("�и��� ���ڿ�" + i + ": " + s[i]);
		//s[0] = Java
		//s[1] = C++
		
		//a = Java,C++
		a = a.substring(5); // �ε��� 5���� ������ ���� ��Ʈ�� ����
		System.out.println(a);
		//a = c++
		
		char c = a.charAt(2); // �ε��� 2�� ���� ����
		System.out.println(c);
		//c = +
		
		}
}
