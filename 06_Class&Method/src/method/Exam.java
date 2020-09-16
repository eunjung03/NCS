package method;

import java.util.Scanner;

public class Exam {
	//학생 정보를 저장하는 메서드
	public static void input(String[] n, int[] h, String[] m, String[] p, Scanner sc) {
		
		for(int i=0; i<n.length; i++) {
			System.out.println((i+1)+"번째 학생 정보 입력");
			System.out.print("학생 이름 입력 >>>");
			n[i] = sc.next();
			
			System.out.print("학생 학번 입력 >>>");
			h[i] = sc.nextInt();
			
			System.out.print("학생 학과 입력 >>>");
			m[i] = sc.next();
			
			System.out.print("학생 연락처 입력 >>>");
			p[i] = sc.next();
		}
	}
	
	//학생 전체의 정보를 출력하는 메서드
	public static void output(String[] n, int[] h, String[] m, String[] p) {
		
		for(int i=0; i<n.length; i++) {
			System.out.println("*** "+(i+1)+"번째 학생 정보 출력 ***");
			System.out.println("학생 이름 >>> "+n[i]);
			System.out.println("학생 학번 >>> "+h[i]);
			System.out.println("학생 학과 >>> "+m[i]);
			System.out.println("학생 연락처 >>> "+p[i]);
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
		}
	}

	// 학생 정보를 조회하는 메서드
	public static void search(String[] n, int[] h, String[] m, String[] p, Scanner sc) {
		
		System.out.println("조회할 학생의 학번을 입력하세요. >>> ");
		int hakbun = sc.nextInt();
		
		for (int i = 0; i < n.length; i++) {
			if(hakbun == h[i]) {
				System.out.println("학생 이름 >>> "+n[i]);
				System.out.println("학생 학번 >>> "+h[i]);
				System.out.println("학생 학과 >>> "+m[i]);
				System.out.println("학생 연락처 >>> "+p[i]);
			}
		}
	}
	
	// 학생 정보를 수정하는 메서드
	public static void update(int[] h, String[] m, String[] p, Scanner sc) {
		System.out.print("수정할 학생의 학번을 입력하세요. >>> ");
		int hakbun = sc.nextInt();
		
		for(int i=0; i<h.length; i++) {
			if(hakbun == h[i]) {
				System.out.print("수정할 학과 입력 >>> ");
				m[i] = sc.next();
				
				System.out.print("수정할 연락처 입력 >>> ");
				p[i] = sc.next();
			}
		}
	}
	
	public static void end(Scanner sc) {
		System.out.print("프로그램을 종료하시겠습니까?[y/n] >>> ");
		String end = sc.next();
		
		if(end.equalsIgnoreCase("Y")) {
			System.out.println("수고하셨습니다.");
			sc.close();
			
			System.exit(0);	// 시스템을 종료시키는 명령어
		}
		
		
	}

	public static void main(String[] args) {

		// 1. 키보드로 학생 수를 입력을 받자.
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요. : ");

		// 2. 학생이름 배열, 학번 배열, 학과 배열, 연락처 배열을 만들자.
		String[] name = new String[sc.nextInt()];
		int[] hakbun = new int[name.length];
		String[] major = new String[hakbun.length];
		String[] phone = new String[major.length];

		// 3. 무한반복을 통하여 메뉴를 만들고 메서드 호출
		while (true) {
			System.out.println("*** 학생 관리 프로그램 ***");
			System.out.println("1. 학생 등록");
			System.out.println("2. 전체 출력");
			System.out.println("3. 학생 조회");
			System.out.println("4. 정보 수정");
			System.out.println("5. 프로그램 종료");
			System.out.print("학생관리 메뉴 중 하나를 선택하세요. : ");
			int menu = sc.nextInt();

			switch (menu) {
				case 1:		// 학생 등록 메서드 인출
					input(name, hakbun, major, phone, sc);
					System.out.println();
					break;
				case 2:		// 학생 정보를 출력하는 메서드 인출
					output(name, hakbun, major, phone);
					System.out.println();
					break;
				case 3:		// 학생 정보를 조회하는 메서드 인출
					search(name, hakbun, major, phone, sc);
					System.out.println();
					break;
				case 4:		// 학생 정보를 수정하는 메서드 인출
					update(hakbun, major, phone, sc);
					System.out.println();
					break;
				case 5:		// 프로그램 종료 여부를 확인하는 메서드 호출
					end(sc);
					System.out.println();
					break;
				default :
					System.out.println("학생관리 프로그램에 없는 메뉴입니다.");
			}

		}

	}

}
