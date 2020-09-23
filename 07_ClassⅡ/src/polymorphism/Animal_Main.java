package polymorphism;

/*
 * 다형성(polymorphism)?
 * - 객체지향 프로그램 4대 특징 중 하나 - 상속과 연관성이 많음.
 * - 다형성의 사전적 의미 - 같은 종의 생물이지만 모습이나 특징이 
 *   고유한 성질을 가지고 있는 것을 말함. ex) 고양이과 - 호랑이 고양이 
 * - 여러 가지 모습으로 해석될 수 있는 형태를 의미함.
 * - 여러 가지 형태를 가질 수 있는 능력을 말함.
 * - 하나의 메서드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것을 말함.
 * - 하나의 사물(객체)을 다양한 타입으로 선언하고 이를 이용할 수 있는 성질.
 * - 하나의 참조변수로 여러 타입의 객체를 참조할 수 있는 것.
 *   => 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것이 다형성의 특징.
 *      예) 조상타입의 참조변수로 자식의 멤버를 호출.
 * - 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있지만, 
 *   반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수는 없음.
 */

class Animal {
	
	void sound() {
		System.out.println("소리를 냅니다.");
	}
	
}

class Dog extends Animal {
	
	@Override
	public void sound() {
		System.out.println("멍멍멍");
	}
	
	void prn() {
		System.out.println("prn 호출");
	}
	
}

class Cat extends Animal {
	
	@Override
	public void sound() {
		System.out.println("야옹야옹");
	}
}

class Tiger extends Animal {
	
	@Override
	public void sound() {
		System.out.println("어흥");
	}
}

public class Animal_Main {

	public static void main(String[] args) {
		
		// Dog, Cat, Tiger 객체 생성 - 일반적인 방법
		// Dog dog = new Dog();
		// Cat cat = new Cat();
		// Tiger tiger = new Tiger();
		
		// 다형성을 이용하여 객체를 생성
		// Dog dog = new Dog();
		// Animal animal = dog;	// 참조변수 dog 
		
		// 다형성 : 조상타입의 참조변수로 자손타입의 메서드 호출
		Animal animal = new Dog();
		animal.sound();
		
		// 다형성을 이용하여 부모의 참조변수로 자식의 객체를 생성했을 때 
		// 부모에는 없는 자식의 멤버를 호출할 수 없다.
		// animal.prn();
		
		Animal animal1 = new Cat();
		animal1.sound();
		
		Animal animal2 = new Tiger();
		animal2.sound();

	}

}
