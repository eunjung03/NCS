package classes;

class TextBook {

	String title; // 책의 제목
	String author; // 책 저자
	int grade; // 몇 학년 책

	public TextBook() {
	} // 기본 생성자

	public TextBook(String t) { // 인자 생성자
		title = t;
	}

	public TextBook(String t, String a) { // 인자 생성자
		title = t;
		author = a;
	}

	public TextBook(String t, String a, int g) { // 인자 생성자
		title = t;
		author = a;
		grade = g;
	}

	public void getBookInfo() {
		System.out.println("책 제목 >>> " + title);
		System.out.println("책 저자 >>> " + author);
		System.out.println("학년 >>> " + grade);
	}

}

public class TextBook_Main {

	public static void main(String[] args) {

		// 기본 생성자로 객체 생성
		TextBook book = new TextBook();
		book.title = "국어";
		book.author = "세종대왕";
		book.grade = 1;
		book.getBookInfo();
		System.out.println();

		// 인자 생성자(인자 1개)로 객체 생성
		TextBook book1 = new TextBook("Java의 정석");
		book1.author = "남궁원";
		book1.grade = 3;
		book1.getBookInfo();
		System.out.println();

		// 인자 생성자(인자 2개)로 객체 생성
		TextBook book2 = new TextBook("영어", "James");
		book2.grade = 5;
		book2.getBookInfo();
		System.out.println();

		// 인자 생성자(인자 3개)로 객체 생성
		TextBook book3 = new TextBook("수학", "아무개", 6);
		book3.getBookInfo();
		System.out.println();
		
	}

}
