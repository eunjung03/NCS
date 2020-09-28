package generic;

class Student {
	
	String name;
	
	public Student() {	}		// 기본 생성자
	
	public Student(String name) {	
		this.name = name;
	}	// 인자 생성자
	
}

// 제네릭이 2개인 경우 기재하는 자료형은
// 참조자료형만 올 수 있음.
class Person<T, E> {
	
	T data;
	E id;
	
	public Person() {	}		// 기본 생성자

	public Person(T data, E id) {	
		this.data = data;
		this.id = id;
	}		// 인자 생성자
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		//Student student = new Student("홍길동");
		//Integer id = new Integer(20092801);
		
		//Person<Student, Integer> person = new Person<Student, Integer>(student, id);
		Person<Student, Integer> person = new Person<Student, Integer>(new Student("홍길동"), new Integer(20092801));
		
		System.out.println(person.data.name + " : "+person.id);
		
		
		Person<Student, String> person1 = new Person<Student, String>(new Student("장은정"), new String("열공합시다."));
		System.out.println(person1.data.name+"! "+person1.id);
		

	}

}
