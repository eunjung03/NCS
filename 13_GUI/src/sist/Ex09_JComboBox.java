package sist;

import javax.swing.*;

public class Ex09_JComboBox {

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		
		JPanel jp = new JPanel();
		
		jf.setTitle("JComboBox 예제");
		
		// 1. 컴포넌트를 만들자.
		String[] job = {"회사원", "공무원", "학생", "주부", "무직"};
		
		JComboBox<String> jcb = new JComboBox<String>(job);
		
		// 디폴트로 처음 나오는 값을 설정.
		// jcb.setSelectedIndex(2);
		jcb.setSelectedItem("공무원");
		
		// 2. 컴포넌트들을 컨테이너에 올려야 한다.
		jp.add(jcb);
		
		// 3. 컨테이너들을 프레임에 올려야 한다.
		jf.add(jp);
		
		jf.setBounds(100, 100, 300, 300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		
	}

}
