package sist;

import java.awt.Color;
import javax.swing.*;

public class Ex04_JButton {

	public static void main(String[] args) {

		// 1. 프레임을 만들자.
		JFrame jf = new JFrame("JButton 예제");
		
		// 2. 컨테이너를 만들자.
		JPanel jp = new JPanel();
		
		// 배경색도 지정해 보자.
		jp.setBackground(Color.YELLOW);
		
		// 이미지 아이콘 컴포넌트를 만들어 보자.
		ImageIcon cherry = new ImageIcon("images/cherry.jpg");
		
		// 3. 컴포넌트를 만들어 보자.
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton(cherry);
		
		// 4. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(jb1);  jp.add(jb2);  jp.add(jb3);  jp.add(jb4);
		
		// 버튼을 비활성화 시키는 방법(클릭이 안 되게)
		jb3.setEnabled(false);
		
		// 버튼을 숨기는 방법
		//jb3.setVisible(false);
		
		// 5. 프레임에 컨테이너를 올리는 방법
		jf.add(jp);
		
		jf.setBounds(100, 100, 300, 300);
		
		jf.setVisible(true);
		
	}

}
