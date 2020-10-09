package sist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TimerThread extends Thread {
	
	JLabel timerLabel;
	
	public TimerThread() {}
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n = 0;		// 타이머 카운트 값
		
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++; 	// 타이머 카운트 값 증가
			try {
				Thread.sleep(1000);		// 1초 동안 잠을 자는 메서드.
			} catch (InterruptedException e) {
				//e.printStackTrace();
				return;		// 예외가 발생하면 스레드 종료.
			}
			
		}
	}
	
}

public class Ex08 extends JFrame {

	public Ex08() {
		setTitle("타이머 예제");
		
		JPanel jp = new JPanel();
		
		// 1. 컴포넌트를 만들어 보자.
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("굴림", Font.ITALIC, 80));
		JButton button = new JButton("Kill");	// 강제적으로 죽이는 것
		
		// 2. 컴포넌트를 컨테이너에 올려야 한다.
		jp.add(timerLabel); jp.add(button);
		
		// 3. 컨테이너를 프레임에 올려야 한다.
		add(jp);
		
		// 타이머 스레드 객체 생성.
		// 타이머 값을 출력할 레이블을 생성자의 인자로 전달
		TimerThread tt = new TimerThread(timerLabel);
		
		setBounds(200, 200, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tt.interrupt(); 	// 타이머 스레드를 강제 종료시키는 메서드.
				button.setEnabled(false); 	// 버튼 비활성화
			}
		});
		
		tt.start();
	}
	
	public static void main(String[] args) {
		
		new Ex08();
		
	}
	
}
