package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요. : ");
		int count = sc.nextInt();
		
		StudentDTO dto;
		
		// 키보드로 학생 수만큼 학생 정보를 입력받아서 list에 저장해 보자.
		for(int i=0; i<count; i++) {
			dto = new StudentDTO();
			System.out.println((i+1) + "번째 학생의 학번, 이름, 학과, 연락처, 주소를 입력하세요...");
			
			dto.setHakbun(sc.nextInt());
			dto.setName(sc.next());
			dto.setMajor(sc.next());
			dto.setPhone(sc.next());
			dto.setAddress(sc.next());
			
			list.add(dto);
			System.out.println("==============================================");
		}
		
		System.out.println("학    번\t이    름\t학    과\t연락처\t주    소\t");
		
		// list에 있는 학생 수만큼의 정보를 화면에 출력해 보자.
		for(int i=0; i<list.size(); i++) {
			dto = list.get(i);
			System.out.println(dto.getHakbun()+"\t"+dto.getName()+"\t"+dto.getMajor()+"\t"+dto.getPhone()+"\t"+dto.getAddress());
		}
		
		sc.close();
	}

}
