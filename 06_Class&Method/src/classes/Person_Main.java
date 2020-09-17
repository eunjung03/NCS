package classes;

class Person{
	
	// 멤버변수
	String name;
	int age;
	boolean marrige;	//default 값 false로 잡힘
	int numberOfChild;
	
}

public class Person_Main {

	public static void main(String[] args) {
		
		Person per = new Person();
		
		per.name = "홍길동";
		per.age = 27;
		
		String mar = "";
		
		if(per.marrige) {
			mar = "기혼";
		}else {
			mar = "미혼";
		}
		
		System.out.println("이  름 >>> "+per.name);
		System.out.println("나  이 >>> "+per.age);
		System.out.println("결혼 여부 >>> "+per.marrige);
		System.out.println("자녀 수 >>> "+per.numberOfChild);
		
		
	}

}
