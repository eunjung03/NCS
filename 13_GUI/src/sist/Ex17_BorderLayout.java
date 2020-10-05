package sist;

import java.awt.BorderLayout;

import javax.swing.*;

/*
 * 2. BorderLayout 배치관리자
 *    - 배치 : 동쪽, 서쪽, 남쪽, 북쪽, 중앙
 */

public class Ex17_BorderLayout {

	public static void main(String[] args) {

		JFrame jf = new JFrame("BorderLayout 배치관리자");
		
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JButton jb1 = new JButton("North");
		JButton jb2 = new JButton("South");
		JButton jb3 = new JButton("East");
		JButton jb4 = new JButton("West");
		JButton jb5 = new JButton("Center");
		
		// 2. 컴포넌트들을 컨테이너에 올려야 한다.
		jp.setLayout(new BorderLayout());
		
		// 형식) new BorderLayout(컴포넌트 정렬방법(수평간격, 수직간격))
		//      수평간격 : 좌우 컴포넌트 사이의 간격. 픽셀단위. 디폴트는 0
		//      수직간격 : 상하 컴포넌트 사이의 간격. 픽셀단위. 디폴트는 0
		jp.setLayout(new BorderLayout(30, 20));
		
		jp.add(jb1, BorderLayout.NORTH);		// 상단에 배치
		jp.add(jb2, BorderLayout.SOUTH);		// 하단에 배치
		jp.add(jb3, BorderLayout.EAST);			// 오른쪽에 배치
		jp.add(jb4, BorderLayout.WEST);			// 왼쪽에 배치
		jp.add(jb5, BorderLayout.CENTER);		// 중앙에 배치
		
		jf.add(jp);
		
		jf.setBounds(200, 200, 300, 300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
	}

}
