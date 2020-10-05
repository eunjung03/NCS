package sist;

import java.awt.BorderLayout;

import javax.swing.*;

public class Ex20_Layout02 {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("간단한 계산기 예제-2");
		
		JPanel jp1 = new JPanel();		// North(상단)
		JPanel jp2 = new JPanel();		// South(하단)
		
		// 1. 컴포넌트들을 만들자.
		// 1-1. North에 들어갈 컴포넌트
		JLabel jl1 = new JLabel("수 1 : ");
		JTextField su1 = new JTextField(5);

		JLabel jl2 = new JLabel("수 2 : ");
		JTextField su2 = new JTextField(5);
		
		JLabel jl3 = new JLabel("연산자 : ");		// 버튼으로 구현 : + - * /
		JRadioButton jrb1 = new JRadioButton("+");
		JRadioButton jrb2 = new JRadioButton("-");
		JRadioButton jrb3 = new JRadioButton("*");
		JRadioButton jrb4 = new JRadioButton("/");
		JRadioButton jrb5 = new JRadioButton("%");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1); bg.add(jrb2); 
		bg.add(jrb3); bg.add(jrb4); bg.add(jrb5);
		
		// 1-2. Center에 들어갈 컴포넌트
		JTextArea jta = new JTextArea(5, 30);
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		// 자동 줄바꿈 기능
		jta.setLineWrap(true);
		
		// 1-3. South에 들어갈 컴포넌트
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		
		// 2. 컴포넌트들을 컨테이너에 올린다.
		// 2-1. North 컴포넌트를 컨테이너에 올린다.
		jp1.add(jl1);   jp1.add(su1);
		jp1.add(jl2);   jp1.add(su2);
		jp1.add(jl3);   jp1.add(jrb1);  jp1.add(jrb2);
		jp1.add(jrb3);  jp1.add(jrb4);  jp1.add(jrb5);

		// 2-2. South 컴포넌트를 컨테이너에 올린다.
		jp2.add(jb1);  jp2.add(jb2);  jp2.add(jb3);
		
		// 3. 컨테이너들을 프레임에 올린다.
		jf.add(jp1, BorderLayout.NORTH);
		jf.add(jsp, BorderLayout.CENTER);
		jf.add(jp2, BorderLayout.SOUTH);
		
		jf.setBounds(200, 200, 500, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}

}
