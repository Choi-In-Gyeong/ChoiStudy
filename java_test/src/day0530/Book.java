package day0530;

public class Book {
	String title;
	String author;
	Book(String title) {
		this(title, "작자미상");//다른 생성자 호출, this() 생성자의 첫줄
		
		
//		this.title = title;
//		this.author = "작자미상";
	}
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}