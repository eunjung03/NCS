package sist;

import javax.swing.*;

public class Ex12_JTable {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("JTable 예제");
		
		// JTable은 컨테이너에 컴포넌트를 올리지 않고 
		// 바로 JFrame에 올린다.
		
		// 1. 컴포넌트를 만들어 보자.
		String[] header = {"학생이름", "국어점수", "영어점수", "수학점수", "JAVA점수"};
		
		String[][] contents = {
								{"홍길동", "94",	"88", "90", "90"},
								{"이순신", "90",	"72", "89", "90"},
								{"유관순", "91",	"71", "90", "90"},
								{"김유신", "88",	"67", "78", "90"},
								{"김연아", "97",	"98", "90", "90"},
								{"강감찬", "71",	"70", "66", "90"},
								{"세종대왕", "100", "100", "100", "90"},
								{"백종원", "89",	"85", "97", "90"},
								{"유재석", "94",	"80", "83", "90"},
								{"강호동", "80",	"80", "80", "90"}
								};
		
		JTable table = new JTable(contents, header);
		
		// 1-1. 스크롤 기능을 추가해 주자.
		JScrollPane jsp = new JScrollPane(
				table,			// 스크롤바가 보여질 컴포넌트, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, // 수직 스크롤바 설치 여부
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);  // 수평 스크롤바 설치 여부
		
		// 2. JTable 컴포넌트를 프레임에 올려야 한다.
		jf.add(jsp);
		
		jf.setBounds(100, 100, 300, 150);
		
		jf.setResizable(false);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		
	}

}
