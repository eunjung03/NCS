package inheritance;

class Human {
	
	// 멤버변수
	String name;		// 이름
	int age;			// 나이
	String job;			// 직업
}

class Student extends Human {
	
	String major;
	void studentgetIntfo() {
		System.out.println("이 름 : "+name);
		System.out.println("나 이 : "+age);
		System.out.println("직 업 : "+job);
		System.out.println("학 과 : "+major);
	}
}

class Employee extends Human {
	
	int salary;
	void employeegetIntfo() {
		System.out.println("이 름 : "+name);
		System.out.println("나 이 : "+age);
		System.out.println("직 업 : "+job);
		System.out.println("급 여 : "+salary);
	}
}

public class Human_Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.name = "홍길동";
		student.age = 23;
		student.job = "대학생";
		student.major = "경제학과";
		student.studentgetIntfo();
		System.out.println();
		
		Employee employee = new Employee();
		employee.name = "임정훈";
		employee.age = 37;
		employee.job = "학원강사";
		employee.salary = 5000;
		employee.employeegetIntfo();
		
	}

}
