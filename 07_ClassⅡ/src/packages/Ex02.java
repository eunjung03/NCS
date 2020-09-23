package packages;

import java.util.Scanner;

import model.MemberDTO;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 회원 수를 키보드로 입력 받으면 객체배열의 크기가 정해짐.
		System.out.print("회원 수를 입력하세요. : ");
		MemberDTO[] dtos = new MemberDTO[sc.nextInt()];
		
		// 2. 반복문을 통해서 회원 수만큼 회원 정보를 키보드로 입력을 받자
		for(int i=0; i<dtos.length; i++) {
			dtos[i] = new MemberDTO();
//			System.out.println(dtos[i]);
			
			System.out.println((i+1)+"번째 회원의 아이디, 비밀번호, 이름, 나이, 주소를 입력하세요...");
			dtos[i].setId(sc.next());
			dtos[i].setPwd(sc.next());
			dtos[i].setName(sc.next());
			dtos[i].setAge(sc.next());
			dtos[i].setAddress(sc.next());	// 초기값 할당
		}
		
		System.out.println("아이디\t비밀번호\t이    름\t나    이\t주    소");
		for(int i=0; i<dtos.length; i++) {
			System.out.print(dtos[i].getId()+"\t"+dtos[i].getPwd()+"\t"+dtos[i].getName()
					+"\t"+dtos[i].getAge()+"\t"+dtos[i].getAddress()+"\n");
			System.out.println("============================================");
		}
		
		sc.close();
	}

}
