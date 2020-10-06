package sist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JoinScreen extends JFrame {
	
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
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new LoginScreen();
				dispose();
			}
		});
		
		client.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(client, "고객를(을) 선택했군요.");
			}
		});
		
		manager.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(manager, "관리자를(을) 선택했군요.");
			}
		});

		etc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(etc, "기타를(을) 선택했군요.");
			}
		});
		
		join.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String idInfo = id.getText();
				String pwdInfo = pwd.getText();
				String nameInfo = name.getText();
				String phoneInfo = phone.getText();
				String personInfo = null;
				
				if(client.isSelected()) {
					personInfo = "고객";
				} else if(manager.isSelected()) {
					personInfo = "관리자";
				} else if(etc.isSelected()) {
					personInfo = "기타";
				}
				
				String result = idInfo+pwdInfo+nameInfo+phoneInfo+personInfo;
				
				JOptionPane.showMessageDialog(join, result);
				
			}
		});
		
	}

}
