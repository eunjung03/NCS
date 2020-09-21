package overriding;

class Animal {
	
	void sound() {
		System.out.println("소리를 냅니다.");
	}
}

class Dog extends Animal {
	
	@Override
	void sound() {
		System.out.println("멍멍멍");		// 재정의
	}
}

class Cat extends Animal {
	
	@Override
	void sound() {
		System.out.println("야옹야옹");
	}
}

class Tiger extends Animal {
	
	@Override
	void sound() {
		System.out.println("어흥");
	}
}

public class Animal_Main {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Tiger tiger = new Tiger();
		
		dog.sound(); cat.sound(); tiger.sound();
	}

}
