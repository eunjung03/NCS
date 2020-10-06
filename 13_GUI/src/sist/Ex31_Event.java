package sist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex31_Event {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("간단한 계산기 예제");
		
		JPanel jp1 = new JPanel();		// North(상단)
		//JPanel jp2 = new JPanel();		// Center(중앙)
		JPanel jp3 = new JPanel();		// South(하단)
		
		// 1. 컴포넌트들을 만들어 보자.
		// 1-1. North(상단)에 들어갈 컴포넌트들을 만들자.
		JLabel jl1 = new JLabel("수 1 : ");
		JTextField su1 = new JTextField(5);	// 5자리 입력
		
		JLabel jl2 = new JLabel("수 2 : ");
		JTextField su2 = new JTextField(5);	// 5자리 입력
		
		JLabel jl3 = new JLabel("연산자 : ");
		JTextField op = new JTextField(1);	
		
		// 1-2. Center(중앙)에 들어갈 컴포넌트들을 만들자.
		JTextArea jta = new JTextArea(8, 30);	// 8행 30열
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		// 자동 줄바꿈 기능
		jta.setLineWrap(true);

		// 1-3. South(하단)에 들어갈 컴포넌트들을 만들자.
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		
		// 2. 컴포넌트들을 컨테이너에 올려야 한다.
		// 2-1. jp1(North) 컨테이너에 1-1 컴포넌트들을 올리자.
		jp1.add(jl1);  jp1.add(su1);
		jp1.add(jl2);  jp1.add(su2);
		jp1.add(jl3);  jp1.add(op);
		
		// 2-2. jp2(Center) 컨테이너에 1-2 컴포넌트들을 올리자.
		//jp2.add(jsp);
		
		// 2-3. jp3(South) 컨테이너에 1-3 컴포넌트들을 올리자.
		jp3.add(jb1);  jp3.add(jb2);  jp3.add(jb3);
		
		// 3. 3개의 컨테이너를 프레임에 올리되, 배치해서 올린다.
		jf.add(jp1, BorderLayout.NORTH);
		jf.add(jsp, BorderLayout.CENTER);	// 컴포넌트가 한 개인 경우 컨테이너 생성하지 않고 바로 프레임에 올려도 됨.
		jf.add(jp3, BorderLayout.SOUTH);
		
		jf.setBounds(200, 200, 350, 250);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// 4. 이벤트 처리
		// 계산(jb1) 버튼을 클릭했을 때 이벤트 처리
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(su1.getText());
				int num2 = Integer.parseInt(su2.getText());
				String op1 = op.getText();
				String result = null;
				
				switch(op1) {
				case "+" : 
					result = "결과 >>> "+ num1 +" + "+ num2+" = "+(num1+num2);
					break;
				case "-" : 
					result = "결과 >>> "+ num1 +" - "+ num2+" = "+(num1-num2);
					break;
				case "*" : 
					result = "결과 >>> "+ num1 +" * "+ num2+" = "+(num1*num2);
					break;
				case "/" : 
					result = "결과 >>> "+ num1 +" / "+ num2+" = "+(num1/num2);
					break;
				case "%" : 
					result = "결과 >>> "+ num1 +" % "+ num2+" = "+(num1%num2);
					break;
				}
				
				jta.append(result+"\n");
				su1.setText(""); su2.setText(null); op.setText(null);	// 입력창 조기화
				su1.requestFocus();		// 입력창 커서
			}
		});
		
		// 종료(jb2) 버튼을 클릭했을 때 이벤트 처리
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);;
			}
		});
		
		// 취소(jb3) 버튼을 클릭했을 때 이벤트 처리
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// null이나 ""는 같다.
				su1.setText(null); su2.setText(null);
				jta.setText(""); op.setText("");
				su1.requestFocus();
			}
		});
	}
}
