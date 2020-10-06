package sist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex29_Event {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("버튼 이벤트");
		
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JButton jb1 = new JButton("입력");
		JButton jb2 = new JButton("종료");
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(jb1); jp.add(jb2);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp, BorderLayout.SOUTH);
		
		jf.setBounds(200, 200, 300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// 4. 이벤트 처리
		// 입력(jb1) 버튼을 클릭했을 때 이벤트 처리.
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력 버튼을 클릭하셨네요~");
				JOptionPane.showMessageDialog(jb1, "입력 버튼 클릭~");	// GUI에서 많이 사용함. null 값주면 중앙에 창이 뜸.
			}
		});
		
		// 종료(jb2) 버튼을 클릭했을 때 이벤트 처리.
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 시스템을 종료시키는 명령어
				System.exit(0);
			}
		});
	}

}
