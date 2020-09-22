package abstracts;

abstract class SmartPhone {	// 추상클래스
	
	// 공통적인 속성 = 멤버변수
	String call = "전화";
	String sns = "SNS";
	String search = "인터넷 검색";
	String game = "게임";
	
	// 각각의 기계(단말기)들의 속성
	String company, name, color, size, weight, price;
	
	void purpose() {
		System.out.println("사용목적 : "+call+" / "+sns+" / "+search+" / "+game);
	}
	
	// 각각의 기계(단말기)들의 spec
	abstract void spec();	// 추상메서드
	
}

class Galaxy extends SmartPhone{
	@Override
	void spec() {
		company = "삼성"; name = "Galaxy Note 20"; color = "화이트";
		size = "20cm"; weight = "350g"; price = "150만원";
		
		System.out.println(company+" / "+name+" / "+color+" / "+size+" / "+weight+" / "+price); 
	
	}
}

class Iphone extends SmartPhone{
	@Override
	void spec() {
		company = "애플"; name = "Iphone 11"; color = "화이트";
		size = "15cm"; weight = "200g"; price = "150만원";
		
		System.out.println(company+" / "+name+" / "+color+" / "+size+" / "+weight+" / "+price); 
	
	}
}

public class Phone_Main {

	public static void main(String[] args) {

		Galaxy galaxy = new Galaxy();
		galaxy.purpose();
		galaxy.spec(); 		// 추상메서드 재정의
		System.out.println();
		
		Iphone iphone = new Iphone();
		iphone.purpose();
		iphone.spec();
		
	}

}
