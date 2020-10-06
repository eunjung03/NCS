package sist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginScreen extends JFrame {
	
	public LoginScreen() {
		super("제품관리 시스템");
		
		JPanel title = new JPanel();
				
		JLabel login = new JLabel("로그인 화면");
		
		//Color color = new Color(5, 0, 153);
		login.setForeground(new Color(5, 0, 153));
		
		//Font font = new Font("휴먼편지체", Font.BOLD, 25);
		login.setFont(new Font("휴먼편지체 보통", Font.BOLD, 25));
		
		// 컴포넌트를 컨테이너에 올려주어야 한다.
		title.add(login);
		
		// 첫번째 패널 객체 생성 
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(3, 2));
		
		JPanel idPanel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jLabel1 = new JLabel("아이디 : ", JLabel.CENTER);
		idPanel1.add(jLabel1);
		
		JPanel idPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField jtf1 = new JTextField(10);
		idPanel2.add(jtf1);
		
		jp1.add(idPanel1); jp1.add(idPanel2);
		
		
		JPanel pwdPanel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel jLabel2 = new JLabel("비밀번호 : ", JLabel.CENTER);
		pwdPanel1.add(jLabel2);
		
		JPanel pwdPanel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField jtf2 = new JTextField(10);
		pwdPanel2.add(jtf2);
		
		jp1.add(pwdPanel1); jp1.add(pwdPanel2);
		
		
		JPanel loginPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton jlogin = new JButton("로그인");
		
		JPanel joinPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton join = new JButton("회원가입");
		
		loginPanel.add(jlogin);
		joinPanel.add(join);
		
		jp1.add(loginPanel);
		jp1.add(joinPanel);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jp2.add(jp1);
		
		setLayout(new BorderLayout());
		add(title, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);
	
		setBounds(200, 200, 300, 250);
		setResizable(false); 	// 화면 크기 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// 4. 이벤트 처리
		join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new JoinScreen();
				dispose();			// 현재 있는 윈도우 창을 없애줌.
			}
		});
		
		jlogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String idInfo = jtf1.getText();
				String pwdInfo = jtf2.getText();
				
				String loginInfo = "아이디 : "+ idInfo + ", 비번 : "+pwdInfo;
				
				JOptionPane.showMessageDialog(jlogin, loginInfo);
			}
		});
		
	}

}
