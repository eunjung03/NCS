package sist;

import java.awt.*;

import javax.swing.*;

public class JoinScreen {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("제품관리 시스템");
		
		// 타이틀 이름
		JPanel title = new JPanel();
		JLabel join = new JLabel("회원가입");
		join.setForeground(new Color(5, 0, 153));
		join.setFont(new Font("휴먼편지체", Font.BOLD, 24));
		
		title.add(join);
		
		JPanel jp = new JPanel(new GridLayout(6,2));
		
		// 고객, 관리자, 기타 라디오버튼 구현
		JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JRadioButton jrb1 = new JRadioButton("고객");
		JRadioButton jrb2 = new JRadioButton("관리자");
		JRadioButton jrb3 = new JRadioButton("기타");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1); bg.add(jrb2); bg.add(jrb3);
		
		jp1.add(jrb1); jp1.add(jrb2); jp1.add(jrb3);
		
		// 아이디 
		JPanel idPanel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jLabel1 = new JLabel("아이디 : ", JLabel.CENTER);
		idPanel1.add(jLabel1);
		
		JPanel idPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField jtf1 = new JTextField(10);
		idPanel2.add(jtf1);
		
		jp.add(idPanel1); jp.add(idPanel2);
		
		// 비밀번호
		JPanel pwdPanel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jLabel2 = new JLabel("비밀번호 : ", JLabel.CENTER);
		pwdPanel1.add(jLabel2);
		
		JPanel pwdPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField jtf2 = new JTextField(10);
		pwdPanel2.add(jtf2);
		
		jp.add(pwdPanel1); jp.add(pwdPanel2);
		
		// 이름
		JPanel namePanel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jLabel3 = new JLabel("이름 : ", JLabel.CENTER);
		namePanel1.add(jLabel3);

		JPanel namePanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField jtf3 = new JTextField(10);
		namePanel2.add(jtf3);

		jp.add(namePanel1);
		jp.add(namePanel2);
		
		// 전화번호
		JPanel phPanel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jLabel4 = new JLabel("전화번호 : ", JLabel.CENTER);
		phPanel1.add(jLabel4);

		JPanel phPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField jtf4 = new JTextField(10);
		phPanel2.add(jtf4);

		jp.add(phPanel1);
		jp.add(phPanel2);
		
		JPanel joinPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton jlogin = new JButton("회원가입");
		
		JPanel cancelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton jcancel = new JButton("취소");
		
		joinPanel.add(jlogin);
		cancelPanel.add(jcancel);
		
		jp.add(joinPanel);
		jp.add(cancelPanel);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jp2.add(jp);
		
		JPanel jp3 = new JPanel(new BorderLayout());
		jp3.add(jp1, BorderLayout.NORTH);
		jp3.add(jp2, BorderLayout.CENTER);
				
		jf.setLayout(new BorderLayout());
		jf.add(title, BorderLayout.NORTH);
		jf.add(jp3, BorderLayout.CENTER);
	
		jf.setBounds(200, 200, 300, 350);
		jf.setResizable(false); 	// 화면 크기 고정
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

	}

}
