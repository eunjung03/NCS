package sist;

import javax.swing.JOptionPane;

/*
 * 키보드로 입력받은 정수값을 5로 나누어 떨어지면
 * "이 값은 5로 나누어집니다." 라고 출력을 하고,
 * 그렇지 않으면 "이 값은 5로 나누어지지 않습니다." 라고
 * 화면에 출력해 보세요.
 * 단, 음수값이 입력이 되면 음수값 입력되었다고 화면에 출력할 것.
 */

public class Ex08 {

	public static void main(String[] args) {
		
		int su = Integer.parseInt(JOptionPane.showInputDialog("정수값을 입력하세요."));
				
		if(su > 0) {
			if(su%5 == 0) {
				System.out.println("입력받은 값은 5로 나누어집니다.");
			}else {
				System.out.println("입력받은 값은 5로 나누어지지 않습니다.");
			}
		}else {
			System.out.println("음수 값을 입력하셨습니다.");
		}
	}

}
