package sist;

import javax.swing.*;

public class Ex11_JLable_JTextField {

	public static void main(String[] args) {

		JFrame jf = new JFrame("JLable&JTextField 예제");
		
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트들을 만들어 보자.
		JLabel jl1 = new JLabel("이 름 : ");
		JTextField name = new JTextField(15);	// 15자리 만들어준다.
		
		JLabel jl2 = new JLabel("학 과 : ");
		JTextField major = new JTextField(15);
		
		JLabel jl3 = new JLabel("주 소 : ");
		JTextField addr = new JTextField(15);
		
		// 2. 컴포넌트들을 컨테이너에 올려야 한다.
		jp.add(jl1); jp.add(name); 
		jp.add(jl2); jp.add(major); 
		jp.add(jl3); jp.add(addr); 
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);
		
		jf.setBounds(100, 100, 250, 200);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		
	}

}
