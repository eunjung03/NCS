package sist;

import java.awt.event.*;

import javax.swing.*;

public class Ex26_Event {

	public static void main(String[] args) {

		JFrame  jf = new JFrame("버튼 이벤트 처리");
		
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JButton button = new JButton("JAVA");

		// 이벤트 처리하는 방법 - 3번째
		// 이벤트 관련 독립된 클래스를 생성.
		MyButton listener = new MyButton();
		
		button.addActionListener(listener);
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(button);

		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);
		
		jf.setBounds(200, 200, 300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}

}

// 독립된 클래스를 작성하여 이벤트 처리.
class MyButton implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton button = (JButton)e.getSource();  //object타입이라서 형변환해줘야한다.
		
		if(button.getText().equals("JAVA")) {
			button.setText("자바");
		} else {
			button.setText("JAVA");
		}
		
	}
	
}
