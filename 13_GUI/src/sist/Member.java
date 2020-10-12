package sist;

import java.awt.*;

import javax.swing.*;

public class Member {

	public static void main(String[] args) {

		JFrame jf = new JFrame();
		jf.setTitle("회원 관리");
		
		JLabel title = new JLabel("회원 관리");
		title.setFont(new Font("굴림체", Font.BOLD, 30));
		title.setForeground(Color.RED);
		JPanel titlePanel = new JPanel(new FlowLayout());
		titlePanel.add(title);
		
		// 이름 라벨 + 텍스트필드
		JLabel nameLabel = new JLabel("이 름");
		JTextField nameText = new JTextField(10);
		
		// 연령 라벨 + 텍스트필드
		JLabel ageLabel = new JLabel("연 령");
		JTextField ageText = new JTextField(10);
		
		JPanel nameAgePanel = new JPanel();
		nameAgePanel.add(nameLabel);
		nameAgePanel.add(nameText);
		nameAgePanel.add(ageLabel);
		nameAgePanel.add(ageText);
		
		// 신장 라벨 + 텍스트필드
		JLabel heightLabel = new JLabel("신 장");
		JTextField heightText = new JTextField(10);

		// 체중 라벨 + 텍스트필드
		JLabel weightLabel = new JLabel("체 중");
		JTextField weightText = new JTextField(10);

		JPanel hwPanel = new JPanel();
		hwPanel.add(heightLabel);
		hwPanel.add(heightText);
		hwPanel.add(weightLabel);
		hwPanel.add(weightText);
		
		JPanel panel = new JPanel(new GridLayout(2, 1));
		panel.add(nameAgePanel);
		panel.add(hwPanel);
		
		// 성별 라디오버튼
		JLabel genderLabel = new JLabel("성 별");
		JRadioButton maleButton = new JRadioButton("Male");
		JRadioButton femaleButton = new JRadioButton("FeMale");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(maleButton); bg.add(femaleButton);
		
		JPanel genderPanel = new JPanel();
		genderPanel.add(genderLabel);
		genderPanel.add(maleButton);  genderPanel.add(femaleButton);
		
		// 목록
		JPanel listPanel = new JPanel(new GridLayout(1, 5));
		JLabel nameLabel1 = new JLabel("이 름");
		JLabel ageLabel1 = new JLabel("나 이");
		JLabel weightLabel1 = new JLabel("체 중");
		JLabel heightLabel1 = new JLabel("신 장");
		JLabel genderLabel1 = new JLabel("성 별");

		listPanel.add(nameLabel1);
		listPanel.add(ageLabel1);
		listPanel.add(weightLabel1);
		listPanel.add(heightLabel1);
		listPanel.add(genderLabel1);
		
		listPanel.setBackground(Color.GRAY);

		// TextArea
		JTextArea jta = new JTextArea(5, 30);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jta.setLineWrap(true);

		jta.setFocusable(false); // JTextArea 컴포넌트에 값이 변경(수정)되지 않도록 하는 메서드.
		

		// 저장, 검색, 삭제, 수정, 지우기 버튼
		JButton saveButton = new JButton("저장");
		JButton searchButton = new JButton("검색");
		JButton deleteButton = new JButton("삭제");
		JButton changeButton = new JButton("수정");
		JButton eraseButton = new JButton("지우기");

		JPanel buttonPanel = new JPanel(new FlowLayout());

		buttonPanel.add(saveButton);
		buttonPanel.add(searchButton);
		buttonPanel.add(deleteButton);
		buttonPanel.add(changeButton);
		buttonPanel.add(eraseButton);

		// 프레임 설정
		// 1. listPanel + TextArea + buttonPanel
		JPanel panel1 = new JPanel(new BorderLayout());
		panel1.add(listPanel, BorderLayout.NORTH);
		panel1.add(jta, BorderLayout.CENTER);
		panel1.add(buttonPanel, BorderLayout.SOUTH);
		
		// 2. genderPanel + panel1
		JPanel panel2 = new JPanel(new BorderLayout());
		panel2.add(genderPanel, BorderLayout.NORTH);
		panel2.add(panel1, BorderLayout.CENTER);
		
		// 3. panel + panel2
		JPanel panel3 = new JPanel(new BorderLayout());
		panel3.add(panel, BorderLayout.NORTH);
		panel3.add(panel2, BorderLayout.CENTER);
		
		
		// 4. panel3 + tiltePanel
		JPanel panel4 = new JPanel(new BorderLayout());
		panel4.add(titlePanel, BorderLayout.NORTH);
		panel4.add(panel3, BorderLayout.CENTER);
		
		jf.add(panel4);
		
		jf.setBounds(200, 200, 500, 500);
		jf.pack();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

}
