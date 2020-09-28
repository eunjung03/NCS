package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {

		List<StudentDTO> list = new ArrayList<StudentDTO>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요. : ");
		int count = sc.nextInt();

		// 키보드로 학생 수만큼 학생 정보를 입력
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번째 학생의 학번, 이름, 학과, 주소를 입력하세요. : ");
			StudentDTO sdto = new StudentDTO();
			sdto.setId(sc.next());
			sdto.setName(sc.next());
			sdto.setMajor(sc.next());
			sdto.setAddress(sc.next());
			
			list.add(sdto);
			System.out.println("=================================================");
		}
		
		System.out.println("학번\t이름\t학과\t주소");
		for(int i=0; i<list.size(); i++) {
			StudentDTO sdto = new StudentDTO();
			sdto = list.get(i);
			System.out.println(sdto.getId()+"\t"+sdto.getName()+"\t"+sdto.getMajor()+"\t"+sdto.getAddress());
		}
		
		
	}

}
