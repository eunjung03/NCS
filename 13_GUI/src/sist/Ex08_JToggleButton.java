package sist;

import javax.swing.*;

public class Ex08_JToggleButton {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		JPanel jp = new JPanel();
		
		jf.setTitle("JToggleButton 예제");
		
		// 1. 컴포넌트를 만들어 보자.
		JToggleButton jtb1 = new JToggleButton("토글버튼1");
		JToggleButton jtb2 = new JToggleButton("토글버튼2");
		JToggleButton jtb3 = new JToggleButton("토글버튼3");
		
		// 2. 컴포넌트는 컨테이너에 올려져야 한다.
		jp.add(jtb1); jp.add(jtb2); jp.add(jtb3);
		
		// 3. 컨테이너는 프레임에 올려져야 한다.
		jf.add(jp);
		
		jf.setBounds(100, 100, 300, 300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		
	}

}
