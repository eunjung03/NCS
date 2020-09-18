package classes;

import java.util.Scanner;

class Book{
	
	String title;		// 책 제목
	String author;		// 책 저자
	String price;		// 책 가격

	public Book() {}	// 기본 생성자
	
	public Book(String title, String author, String price) {
		this.title = title;
		this.author = author;
		this.price = price;
	} // 인자 생성자
}

public class Book_Main {

	public static void main(String[] args) {

		// 객체 배열 생성
		Book[] books = new Book[3];
		System.out.println(books);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<books.length; i++) {
			System.out.println((i+1)+"번째 책 제목, 책 저자, 가격을 입력하세요...");
			
			books[i] = new Book(sc.nextLine(), sc.nextLine(), sc.nextLine());
		}
		/*System.out.println(books[0]);
		System.out.println(books[1]);
		System.out.println(books[2]);*/
		
		for(int i=0; i<books.length; i++) {
			System.out.println("<"+books[i].title+", "+books[i].author+", "+books[i].price+"원>");
		}
		
		sc.close();
	}

}
