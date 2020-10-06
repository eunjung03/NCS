package sist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex34_Practice {

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
		JTextArea jta = new JTextArea(5, 30);
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
		
		jf.setBounds(200, 200, 500, 300);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		// 4. 이벤트 처리
		//계산(jbt1)
		jbt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int count = Integer.parseInt(su1.getText());
				int money = Integer.parseInt(su2.getText());

				String menu = null;
				int price = 0;
				
				if(jrb1.isSelected()) {
					menu = "아메리카노";
					price = 2500;
				} else if(jrb2.isSelected()) {
					menu = "카페모카";
					price = 3500;
				} else if(jrb3.isSelected()) {
					menu = "에소프레소";
					price = 2500;
				} else if(jrb4.isSelected()) {
					menu = "카페라떼";
					price = 4000;
				}
				
				int total = price * count;
				int tax = total / 10;
				int coffeePrice = total+tax;
				int change = money - coffeePrice;
				
				String result =
						"커피종류 : "+menu+"\n"+
						"커피단가 : "+price+"원\n"+		
						"수      량 : "+count+"\n"+	
						"공급가액 : "+total+"원\n"+
						"부가세액 : "+tax+"원\n"+
						"총 금 액 : "+coffeePrice+"원\n"+
						"입 금 액 : "+money+"원\n"+
						"거스름돈 : "+change+"원\n";
				
				jta.append(result);
				
				// 초기화
				su1.setText(null); su2.setText(null);
				bg.clearSelection();
				
				su1.requestFocus();
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
				// 초기화
				su1.setText(null); su2.setText(null);
				jta.setText(null);
				bg.clearSelection();
				
				su1.requestFocus();
			}
		});
		
	}

}
