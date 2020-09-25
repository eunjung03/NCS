package object;

/*
 * toString() 메서드 재정의
 * - Object 클래스에서 상속 받은 메서드를 
 *   유용한 정보가 리턴 되도록 재정의.
 * - 해당 클래스의 멤버변수가 정보를 가지고 있는데 
 *   저장된 데이터가 올바른 값이 담겼는지, 혹은 틀리게 담겼는지 확인하고 싶은 경우
 *   toString() 메서드를 재정의하여 값을 확인할 수 있음.
 */

class Student { // extends Object 가 생략
	
	String name;
	int hakbun;
	
	public Student() {	}

	public Student(String name, int hakbun) {	
		this.name = name;
		this.hakbun = hakbun;
	}
	
	// 학생 정보를 확인하는 메서드
	/*void prn() {
		System.out.println("학생 이름 >>> " + name);
		System.out.println("학생 학번 >>> " + hakbun);
	}*/

	@Override
		public String toString() {
			return "학생 이름 : "+name+", 학생 학번 : "+hakbun;
		}
	
}

public class Ex03 {

	public static void main(String[] args) {

		Student student = new Student("홍길동", 20092501);
		//student.prn();
		
		System.out.println(student.toString());
		
	}

}
