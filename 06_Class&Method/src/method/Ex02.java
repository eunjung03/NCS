package method;

public class Ex02 {
	
	// 1~500 까지의 합을 구하는 메서드
	public static void total() {
		int sum = 0;
		// 1~500까지의 합을 구함.
		for(int i=1; i<=500; i++) {
			sum += i;
		}
		// 합을 출력함.
		System.out.println("1~500까지의 합 >>> "+sum);
	} // total 메서드 end

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		
		// [문제] 1~500까지의 합을 구하는 메서드를 호출
		total();
		
		System.out.println("프로그램 종료");
	}

}
