package statics;

/*
 * 싱글턴(singleton) 방식?
 * - 생성자를 private 접근지정자를 사용하여 외부에서 직접 접근을 못하게 불허하는 방식.
 * - 외부(다른 클래스)에서 해당 클래스의 인스턴스를 new로 생성하지 못하도록 하는 방식.
 * - 사용하는 이유 : 매번 객체를 생성할 때마다 메모리 성능이 느려지는 단점이 발생하기 때문.
 */

class Company {
	
	private static Company instance = null;
	
	private Company() {	}	// 기본 생성자
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;	// 주소값 반환
	}
	
}

public class Ex01 {

	public static void main(String[] args) {

		Company com1 = Company.getInstance();
		Company com2= Company.getInstance();
		Company com3= Company.getInstance();
		Company com4= Company.getInstance();
		Company com5= Company.getInstance();
		Company com6= Company.getInstance();
		Company com7= Company.getInstance();
		Company com8= Company.getInstance();
		Company com9= Company.getInstance();
		Company com10= Company.getInstance();
		
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
		System.out.println(com4);
		System.out.println(com5);
		System.out.println(com6);
		System.out.println(com7);
		System.out.println(com8);
		System.out.println(com9);
		System.out.println(com10);
		
		
		/*Company company1 = new Company();
		Company company2 = new Company();
		Company company3 = new Company();
		Company company4 = new Company();
		Company company5 = new Company();
		Company company6 = new Company();
		Company company7 = new Company();
		Company company8 = new Company();
		Company company9 = new Company();
		Company company10 = new Company();*/
		
		/*System.out.println(company1);
		System.out.println(company2);
		System.out.println(company3);
		System.out.println(company4);
		System.out.println(company5);
		System.out.println(company6);
		System.out.println(company7);
		System.out.println(company8);
		System.out.println(company9);
		System.out.println(company10);*/
		
	}

}
