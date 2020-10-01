package sist;

import javax.swing.*;

public class Ex10_JList {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("JList 예제");
		
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트들을 만들어 보자.
		String[] job = {"회사원", "공무원", "학생", "주부", "무직"};

		JList<String> list = new JList<String>(job);
		
		// 2. 컴포넌트들을 컨테이너에 올려야 한다.
		jp.add(list);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);
		
		jf.setBounds(100, 100, 300, 300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);

	}

}
