package sist;

import java.awt.event.*;

import javax.swing.*;

public class Ex30_Event {

	public static void main(String[] args) {

		JFrame jf = new JFrame("텍스트 영역 이벤트");
		
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JLabel label = new JLabel("입력 후 <Enter> 키를 입력하세요.");
		
		JTextField text = new JTextField(25);
		
		JTextArea jta = new JTextArea(5, 30);
		
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(false);
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(label); jp.add(text); jp.add(jsp);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		jf.add(jp);
		
		jf.setBounds(200, 200, 300, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// 4. 이벤트 처리
		text.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//setText는 기존 내용이 지워짐.
				jta.append(text.getText()+"\n"); // 기존 내용을 두고 추가해줌
				text.setText("");
			}
		});
	}
}
