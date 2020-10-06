package sist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex33_Practice {

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
		JTextField math = new JTextField(5);
		
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
		jp2.add(jl4); jp2.add(math);
		
		// 2-2. South
		jp3.add(jbt1); jp3.add(jbt2); jp3.add(jbt3);		
		
		// 3. 컨테이너를 프레임에 올리기
		JPanel pg = new JPanel(new BorderLayout());
		pg.add(jp2, BorderLayout.NORTH);
		pg.add(jsp, BorderLayout.CENTER);
		pg.add(jp3, BorderLayout.SOUTH);
		
		jf.add(jp1, BorderLayout.NORTH);
		jf.add(pg, BorderLayout.CENTER);
		
		jf.setBounds(200, 200, 400, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// 4. 이벤트 처리
		// 계산(jbt1)
		jbt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name1 = name.getText();
				int kor1 = Integer.parseInt(kor.getText());
				int eng1 = Integer.parseInt(eng.getText());
				int math1 = Integer.parseInt(math.getText());
				
				int total = kor1 + eng1 + math1;
				double avg = total/3.0;
				String grade;
				
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
				
				String result = 
						"*** "+name1+"님 성적결과 ***" + "\n"
						+"국어점수 : "+kor1+"점"+"\n"
						+"영어점수 : "+eng1+"점"+"\n"
						+"수학점수 : "+math1+"점"+"\n"
						+"총      점 : "+total+"점"+"\n"
						+"평      균 : "+String.format("%.2f", avg)+"점"+"\n"
						+"학      점 : "+grade+"\n";
				
				jta.append(result);

				name.setText(null); kor.setText(null); eng.setText(null); math.setText(null);
				name.requestFocus();
				
			}
		});
		
		// 종료(jbt2)
		jbt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// 취소(jbt3)
		jbt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				name.setText(null); kor.setText(null);
				eng.setText(null); math.setText(null);
				jta.setText(null);
				name.requestFocus();
			}
		});
		
		

	}

}
