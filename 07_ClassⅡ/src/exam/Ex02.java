package exam;

class Student {
	
	// 멤버변수
	String studentName;		// 학생 이름
	int tMoney;				// 학생 교통카드 잔액
	
	public Student() {	}	// 기본 생성자

	public Student(String studentName, int tMoney) {
		this.studentName = studentName;
		this.tMoney = tMoney;
	}	// 인자 생성자
	
	// 버스를 타고 오는 경우
	void takeBus(Bus bus) {
		bus.take(1200);
		this.tMoney -= 1200;
	}
	
	// 지하철을 타고 오는 경우
	void takeSubway(Subway subway) {
		subway.take(1250);
		this.tMoney -= 1250;
	}
	
	// 학생 정보 출력
	void showStudentInfo() {
		System.out.println(studentName+"님의 카드 잔액은 "+tMoney+"원 입니다.");
	}
}

class Bus {
	
	// 멤버변수
	int busNumber;			// 버스 번호
	int passengerCount;		// 승객 수
	int money;				// 버스 회사의 수입
	
	public Bus() {	}		// 기본 생성자
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}	// 인자 생성자
	
	// 승차 메서드
	void take(int money) {
		this.money += money;	// this.money = this.money + money;
		passengerCount++;
	}
	
	// 버스회사 정보 출력
	void showBusInfo() {
		System.out.println("버스 No : "+busNumber);
		System.out.println("버스 승객 수 : "+passengerCount);
		System.out.println("버스 회사 수입 : "+money);
		System.out.println("==============================");
	}
}

class Subway {
	
	// 멤버변수
	int lineNumber;			// 지하철 노선
	int passengerCount;		// 지하철 노선 승객 수
	int money;				// 지하철 회사의 수입
	
	public Subway() {	}	// 기본 생성자

	public Subway(int lineNumber) {	
		this.lineNumber = lineNumber;
	}	// 인자 생성자
	
	// 승차 메서드
	void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	// 지하철 회사 정보 출력
	void showSubwayInfo() {
		System.out.println("지하철 노선 No : "+lineNumber);
		System.out.println("지하철 승객 수 : "+passengerCount);
		System.out.println("지하철 회사 수입 : "+money);
		System.out.println("==============================");
	}
}

public class Ex02 {

	public static void main(String[] args) {

		Student student1 = new Student("이동현", 50000);
		Student student2 = new Student("박지원", 60000);
		
		Bus bus100 = new Bus(100);
		
		Subway subwayGreen = new Subway(2);
		
		student1.takeBus(bus100);
		student2.takeSubway(subwayGreen);
		
		student1.showStudentInfo();
		System.out.println();
		student2.showStudentInfo();
		System.out.println();
		
		bus100.showBusInfo();
		System.out.println();
		subwayGreen.showSubwayInfo();
		System.out.println();
		
	}

}
