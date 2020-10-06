package sist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex32_Event {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("계산기 예제-2");
		
		JPanel jp1 = new JPanel();		// North(상단)
		JPanel jp2 = new JPanel();		// North(상단)
		JPanel jp3 = new JPanel();		// South(하단)
		
		// 1. 컴포넌트들을 만들자.
		// 1-1. jp1 컨테이너에 들어갈 컴포넌트
		JLabel jl1 = new JLabel("수 1 : ");
		JTextField su1 = new JTextField(7);

		JLabel jl2 = new JLabel("수 2 : ");
		JTextField su2 = new JTextField(7);
		
		// 1-2. jp2 컨테이너에 들어갈 컴포넌트
		JLabel jl3 = new JLabel("연산자 : ");		// 버튼으로 구현 : + - * /
		JRadioButton jrb1 = new JRadioButton("+");
		JRadioButton jrb2 = new JRadioButton("-");
		JRadioButton jrb3 = new JRadioButton("*");
		JRadioButton jrb4 = new JRadioButton("/");
		JRadioButton jrb5 = new JRadioButton("%");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1); bg.add(jrb2); 
		bg.add(jrb3); bg.add(jrb4); bg.add(jrb5);
		
		// 1-3. TextArea 컴포넌트
		JTextArea jta = new JTextArea(5, 30);
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		// 자동 줄바꿈 기능
		jta.setLineWrap(true);
		
		// 1-4. jp3 컨테이너에 들어갈 컴포넌트
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		
		// 2. 컴포넌트들을 컨테이너에 올린다.
		// 2-1. 1-1 컴포넌트들을 jp1 컨테이너에 올려야 한다.
		jp1.add(jl1);   jp1.add(su1);
		jp1.add(jl2);   jp1.add(su2);

		// 2-2. 1-2 컴포넌트들을 jp2 컨테이너에 올려야 한다.
		jp2.add(jl3);   jp2.add(jrb1);  jp2.add(jrb2);
		jp2.add(jrb3);  jp2.add(jrb4);  jp2.add(jrb5);

		// 2-3.  1-4 컴포넌트들을 jp3 컨테이너에 올려야 한다.
		jp3.add(jb1);  jp3.add(jb2);  jp3.add(jb3);
		
		// 컨테이너를 하나를 더 만들자
		JPanel pg = new JPanel(new BorderLayout());
		
		// 새로 추가한 컨테이너에 기존의 컨테이너를 올려주자
		pg.add(jp2, BorderLayout.NORTH); 
		pg.add(jsp, BorderLayout.CENTER); 
		pg.add(jp3, BorderLayout.SOUTH);

		// 컨테이너를 프레임에 올려주어야 한다.
		jf.add(jp1, BorderLayout.NORTH);
		jf.add(pg, BorderLayout.CENTER);
		
		jf.setBounds(200, 200, 600, 600);
		
		jf.pack();	// pack을 쓰면 크기가 조정됨
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

		// 4. 이벤트 처리
		// 계산(jb1) 버튼을 클릭했을 때 이벤트 처리
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(su1.getText());
				int num2 = Integer.parseInt(su2.getText());
				String result = null;
				
				if(jrb1.isSelected()) {
					result = "결과 >>> "+num1+" + "+num2+" = "+(num1+num2);
				} else if(jrb2.isSelected()) {
					result = "결과 >>> "+num1+" - "+num2+" = "+(num1-num2);
				} else if(jrb3.isSelected()) {
					result = "결과 >>> "+num1+" * "+num2+" = "+(num1*num2);
				} else if(jrb4.isSelected()) {
					result = "결과 >>> "+num1+" / "+num2+" = "+(num1/num2);
				} else if(jrb5.isSelected()) {
					result = "결과 >>> "+num1+" % "+num2+" = "+(num1%num2);
				}
				
				jta.append(result+"\n");
				
				// 입력받은 수1, 수2 텍스트필드 컴포넌트가 초기화 되어야 함.
				su1.setText(null); su2.setText(null);

				// 라디오버튼도 초기화가 되어야 한다.
				bg.clearSelection();
				
				su1.requestFocus();
			}
		});
		
		// 종료(jb2) 버튼을 클릭했을 때 이벤트 처리
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// 취소(jb3) 버튼을 클릭했을 때 이벤트 처리
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 입력받은 수1, 수2 텍스트필드 컴포넌트가 초기화 되어야 함.
				su1.setText(null); su2.setText(null);
				jta.setText(null);

				// 라디오버튼도 초기화가 되어야 한다.
				bg.clearSelection();
				
				su1.requestFocus();
			}
		});
		
		
	}

}
