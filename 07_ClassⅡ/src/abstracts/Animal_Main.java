package abstracts;

abstract class Animal {	// 부모클래스 - 추상클래스
	
	abstract void sound();	// 추상메서드
}

class Dog extends Animal {	// 자식클래스
	@Override
	void sound() {	// 추상메서드 재정의
		System.out.println("멍멍멍");
	}
}

class Cat extends Animal {	// 자식클래스
	@Override
	void sound() {	// 추상메서드 재정의
		System.out.println("야옹야옹");
	}
}

class Tiger extends Animal { // 자식클래스
	@Override
	void sound() {	// 추상메서드 재정의
		System.out.println("어흥");
	}
}

public class Animal_Main {

	public static void main(String[] args) {

		// 객체 생성
		Dog dog = new Dog();
		Cat cat = new Cat();
		Tiger tiger = new Tiger();
		
		// 각 객체의 sound() 메서드 호출
		dog.sound();  cat.sound();  tiger.sound();
		
	}

}
