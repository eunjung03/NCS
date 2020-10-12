package sist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex35_Event extends Frame implements MouseListener {

	//CardLayout은 Frame에서 사용할 수 있다.(JFrame (X))
	CardLayout card = new CardLayout();

	public Ex35_Event() {
		
		//JFrame jf = new JFrame("CardLayout 예제");
		super("CardLayout 예제");

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();

		setLayout(card);

		jp1.setBackground(Color.BLUE);
		jp2.setBackground(Color.YELLOW);
		jp3.setBackground(Color.CYAN);
		jp4.setBackground(Color.GRAY);

		jp1.add(new JLabel("Card1"));
		jp2.add(new JLabel("Card2"));
		jp3.add(new JLabel("Card3"));
		jp4.add(new JLabel("Card4"));

		add(jp1, "1"); add(jp2, "2"); // "숫자"는 순서.
		add(jp3, "3"); add(jp4, "4");
		
		jp1.addMouseListener(this);
		jp2.addMouseListener(this);
		jp3.addMouseListener(this);
		jp4.addMouseListener(this);

		setBounds(200, 200, 300, 300);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		card.next(this);			// 다음 카드로 넘어가는 메서드
		// card.previous(this);		// 이전 카드로 넘어가는 메서드
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	public static void main(String[] args) {

		new Ex35_Event();
		
	}

}
