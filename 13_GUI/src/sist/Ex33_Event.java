package sist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex33_Event {

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		// 컴포넌트 만들기
		// 1-1 North
		JLabel jl1 = new JLabel("이 름 : ");
		JTextField name = new JTextField(10);
		JLabel jl2 = new JLabel("국 어 : ");
		JTextField kor = new JTextField(5);
		JLabel jl3 = new JLabel("영 어 : ");
		JTextField eng = new JTextField(5);
		JLabel jl4 = new JLabel("수 학 : ");
		JTextField mat = new JTextField(5);
		
		// 1-2 Center
		JTextArea jta = new JTextArea(5, 30);
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jta.setLineWrap(true);
		
		// 1-3 South
		JButton jbt1 = new JButton("계산");
		JButton jbt2 = new JButton("종료");
		JButton jbt3 = new JButton("취소");
		
		// 2. 컴포넌트를 컨테이너에 올림
		// 2-1. North
		jp1.add(jl1); jp1.add(name);
		jp2.add(jl2); jp2.add(kor);
		jp2.add(jl3); jp2.add(eng);
		jp2.add(jl4); jp2.add(mat);
		
		// 2-2. South
		jp3.add(jbt1); jp3.add(jbt2); jp3.add(jbt3);		
		
		// 새로운 컨테이너에 기존의 컨테이너들을 추가시키자.
		JPanel pg = new JPanel(new BorderLayout());
		pg.add(jp2, BorderLayout.NORTH);
		pg.add(jsp, BorderLayout.CENTER);
		pg.add(jp3, BorderLayout.SOUTH);
		
		// 3. 컨테이너를 프레임에 올리기
		jf.add(jp1, BorderLayout.NORTH);
		jf.add(pg, BorderLayout.CENTER);
		
		// JTextArea 컴포넌트에 값이 변경(수정)되지 않도록 하는 메서드.
		// setFocusable()
		jta.setFocusable(false); 
		
		jf.setBounds(200, 200, 500, 500);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// 4. 이벤트 처리
		// 계산 버튼(jbt1) 클릭 시 이벤트 처리
		jbt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String irum = name.getText();
				int korea = Integer.parseInt(kor.getText());
				int english = Integer.parseInt(eng.getText());
				int math = Integer.parseInt(mat.getText());
				
				// 총점 구하기
				int total = korea + english + math;
				
				// 평균 구하기
				double avg = total / 3.0;
				
				// 학점 구하기
				String grade = null;
				
				if(avg>=90) {
					grade = "A학점";
				} else if(avg>=80) {
					grade = "B학점";
				} else if(avg>=70) {
					grade = "C학점";
				} else if(avg>=60) {
					grade = "D학점";
				} else {
					grade = "F학점";
				}
				
				// jta 컴포넌트에 성적 결과를 출력해 보자.
				jta.append("*** "+irum+"님 성적 결과 ***\n");
				jta.append("이      름 : "+irum+"\n");
				jta.append("국어점수 : "+korea+"점\n");
				jta.append("영어점수 : "+english+"점\n");
				jta.append("수학점수 : "+math+"점\n");
				jta.append("총      점 : "+total+"점\n");
				jta.append("평      균 : "+String.format("%.2f점\n", avg));
				jta.append("학      점 : "+grade+"\n");
				
				// 각각의 컴포넌트 초기화
				name.setText(null); kor.setText(null);
				eng.setText(null); mat.setText(null);
				name.requestFocus();
			}
		});
		
		// 종료 버튼(jbt2) 클릭 시 이벤트 처리
		jbt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// 취소 버튼(jbt3) 클릭 시 이벤트 처리
		// 각각의 컴포넌트 초기화
		name.setText(null); kor.setText(null);
		eng.setText(null); mat.setText(null);
		jta.setText(null);
		name.requestFocus();
		
	}

}
