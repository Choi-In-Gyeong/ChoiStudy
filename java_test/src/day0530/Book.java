package day0530;

public class Book {
	String title;
	String author;
	Book(String title) {
		this(title, "���ڹ̻�");//�ٸ� ������ ȣ��, this() �������� ù��
		
		
//		this.title = title;
//		this.author = "���ڹ̻�";
	}
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}