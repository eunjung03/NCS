package sist;

import java.awt.*;
import java.awt.event.*;
import javax.*;
import javax.swing.*;

public class Ex34_Event {

	public static void main(String[] args) {

		JFrame jf = new JFrame("커피 자판기");

		JPanel jp1 = new JPanel();	// North
		JPanel jp2 = new JPanel();	
		JPanel jp3 = new JPanel();	
		JPanel jp4 = new JPanel();	// South
		
		// 1. 컴포넌트들을 만들자.
		// 1-1. North 컴포넌트
		JLabel jl1 = new JLabel("원하는 커피 선택");
		
		JRadioButton jrb1 = new JRadioButton("아메리카노(2500)");
		JRadioButton jrb2 = new JRadioButton("카페모카(3500)");
		JRadioButton jrb3 = new JRadioButton("에스프레소(2500)");
		JRadioButton jrb4 = new JRadioButton("카페라떼(4000)");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1); bg.add(jrb2); bg.add(jrb3); bg.add(jrb4);
		
		JLabel jl2 = new JLabel("수 량 : ");
		JTextField su1 = new JTextField(8);
		
		JLabel jl3 = new JLabel("입급액 : ");
		JTextField su2 = new JTextField(8);
		
		// 1-2 Center 컴포넌트
		JTextArea jta = new JTextArea(10, 30);
		JScrollPane jsp = new JScrollPane(
				jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jta.setLineWrap(true);
		
		// 1-3 South 컴포넌트
		JButton jbt1 = new JButton("계산");
		JButton jbt2 = new JButton("종료");
		JButton jbt3 = new JButton("취소");
		
		// 2. 컴포넌트들을 컨테이너에 올리자
		// 2-1. North
		jp1.add(jl1);
		
		jp2.add(jrb1); jp2.add(jrb2); jp2.add(jrb3); jp2.add(jrb4);
		
		jp3.add(jl2); jp3.add(su1);
		jp3.add(jl3); jp3.add(su2);
		
		// 2-2. South
		jp4.add(jbt1); jp4.add(jbt2); jp4.add(jbt3);
		
		// 3. 컨테이너를 프레임에 올리자
		JPanel pg1 = new JPanel(new BorderLayout());
		pg1.add(jp3, BorderLayout.NORTH);
		pg1.add(jsp, BorderLayout.CENTER);
		pg1.add(jp4, BorderLayout.SOUTH);
		
		JPanel pg = new JPanel(new BorderLayout());
		pg.add(jp2, BorderLayout.NORTH);
		pg.add(pg1, BorderLayout.CENTER);
		
		jf.add(jp1, BorderLayout.NORTH);
		jf.add(pg, BorderLayout.CENTER);
		
		jf.setBounds(200, 200, 500, 400);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// 4. 이벤트 처리
		// 계산 버튼(jbt1) 클릭 시 이벤트 처리
		jbt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String coffeeStr = null; 	// 커피 종류
				int coffeeInt = 0;			// 커피 단가
				
				if(jrb1.isSelected()) {
					coffeeStr = "아메리카노";
					coffeeInt = 2500;
				} else if (jrb2.isSelected()) {
					coffeeStr = "카페모카";
					coffeeInt = 3500;
				} else if (jrb3.isSelected()) {
					coffeeStr = "에소프레소";
					coffeeInt = 2500;
				} else if (jrb4.isSelected()) {
					coffeeStr = "카페라떼";
					coffeeInt = 4000;
				}
				
				int amount = Integer.parseInt(su1.getText());
				int money1 = Integer.parseInt(su2.getText());

				// 공급가액 계산 : 수량 * 단가
				int sum = amount * coffeeInt;
				
				// 부가세액 계산 : 공급가액 * 0.1
				int vat = (int)(sum * 0.1);
				
				// 총금액 계산 : 공급가액 + 부가세액
				int total = sum + vat;
				
				// 잔액(거스름돈) 계산 : 입금액 - 총금액 
				int result = money1 - total;
				
				// JTextArea 화면에 출력해 보자.
				jta.append("커피종류 : "+coffeeStr+"\n");
				jta.append("커피단가 : "+coffeeInt+"원\n");
				jta.append("수      량 : "+amount+"\n");
				jta.append("공급가액 : "+sum+"원\n");
				jta.append("부가세액 : "+vat+"원\n");
				jta.append("총 금 액 : "+total+"원\n");
				jta.append("입 금 액 : "+money1+"원\n");
				jta.append("거스름돈 : "+result+"원\n");
				
				// 각각의 컴포넌트 초기화 작업
				bg.clearSelection();
				su1.setText(null); 	su2.setText(null);
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
		jbt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 각각의 컴포넌트 초기화 작업
				bg.clearSelection();
				su1.setText(null); 	su2.setText(null);
				jta.setText(null);
			}
		});
	}

}
