package sist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JoinScreen extends JFrame {
	
	String choice;
	
	public JoinScreen() {
		super("회원관리 시스템");

		// 1. 컴포넌트들을 만들어 보자.
		JLabel title = new JLabel("회원가입", SwingConstants.CENTER);
		
		title.setForeground(new Color(5, 0, 153));
		title.setFont(new Font("휴먼편지체", Font.BOLD, 30));
		
		JButton join = new JButton("회원가입");
		JButton cancel = new JButton("취소");
		
		JTextField id = new JTextField(10);
		JTextField pwd = new JTextField(10);
		JTextField name = new JTextField(10);
		JTextField phone = new JTextField(10);
		
		JRadioButton client = new JRadioButton("고객");
		JRadioButton manager = new JRadioButton("관리자");
		JRadioButton etc = new JRadioButton("기타");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(client); bg.add(manager); bg.add(etc);
		
		// radio panel
		JPanel radioPanel = new JPanel();
		radioPanel.setLayout(new FlowLayout());
		radioPanel.add(client);
		radioPanel.add(manager);
		radioPanel.add(etc);
		
		// form panels
		JPanel idPanel = new JPanel();
		idPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		idPanel.add(new JLabel("아이디 : "));
		idPanel.add(id);
		
		JPanel pwdPanel = new JPanel();
		pwdPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pwdPanel.add(new JLabel("비밀번호 : "));
		pwdPanel.add(pwd);
		
		JPanel namePanel = new JPanel();
		namePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		namePanel.add(new JLabel("이  름 : "));
		namePanel.add(name);
		
		JPanel phonePanel = new JPanel();
		phonePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		phonePanel.add(new JLabel("전화번호 : "));
		phonePanel.add(phone);
		
		JPanel formPanel = new JPanel();
		formPanel.setLayout(new GridLayout(4, 1));
		formPanel.add(idPanel);
		formPanel.add(pwdPanel);
		formPanel.add(namePanel);
		formPanel.add(phonePanel);
		
		// radio + form panel
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new FlowLayout());
		contentPanel.add(radioPanel);
		contentPanel.add(formPanel);
		
		// button panel
		JPanel joinCancelPanel = new JPanel();
		joinCancelPanel.add(join);
		joinCancelPanel.add(cancel);
		
		add(title, BorderLayout.NORTH);
		add(contentPanel, BorderLayout.CENTER);
		add(joinCancelPanel, BorderLayout.SOUTH);
		
		setBounds(200, 200, 250, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		// 4. 이벤트 처리
		// 회원가입 버튼을 클릭했을 때 이벤트 처리
		join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String idInfo = id.getText().toString();
				String pwdInfo = pwd.getText().toString();
				String nameInfo = name.getText().toString();
				String phoneInfo = phone.getText().toString();

				JOptionPane.showMessageDialog(join, 
						"아이디 : "+idInfo+", 비밀번호 : "+pwdInfo+", 이름 : "+nameInfo
						+", 전화번호 : "+phoneInfo+", 가입유형 : "+choice);
			}
		});

		// 취소 버튼을 클릭했을 때 이벤트 처리
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new LoginScreen();
				dispose();
			}
		});
		
		// 고객 라디오 버튼을 클릭했을 때 이벤트 처리
		client.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				choice = client.getText().toString();
				JOptionPane.showMessageDialog(client, choice+"를(을) 선택했군요.");
			}
		});
		
		// 관리자 라디오 버튼을 클릭했을 때 이벤트 처리
		manager.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				choice = manager.getText().toString();
				JOptionPane.showMessageDialog(manager, choice+"를(을) 선택했군요.");
			}
		});

		// 기타 라디오 버튼을 클릭했을 때 이벤트 처리
		etc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				choice = etc.getText().toString();
				JOptionPane.showMessageDialog(etc, choice+"를(을) 선택했군요.");
			}
		});
	}

}
