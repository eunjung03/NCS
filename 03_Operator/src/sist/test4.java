package sist;

public class test4 {

	public static void main(String[] args) {

		int money = Integer.parseInt(args[0]);
		
		int a, b, c, d, e, f, g;
		
		a = money / 5000;
		b = (money - 5000 * a) / 1000;
		c = (money - 5000 * a - 1000 * b) / 500;
		d = (money - 5000 * a - 1000 * b - 500 * c) / 100;
		e = (money - 5000 * a - 1000 * b - 500 * c - 100 * d) / 50;
		f = (money - 5000 * a - 1000 * b - 500 * c - 100 * d - 50 * e) / 10;
		g = (money - 5000 * a - 1000 * b - 500 * c - 100 * d - 50 * e - 10 * f);
		
		System.out.println("입력받은 숫자 ==> " + money);
		System.out.printf("오천원 지폐 : %d장\n", a);
		System.out.printf("천원 지폐 : %d장\n", b);
		System.out.printf("오백원 동전 : %d개\n", c);
		System.out.printf("백원 동전 : %d개\n", d);
		System.out.printf("오십원 동전 : %d개\n", e);
		System.out.printf("십원 동전 : %d개\n", f);
		System.out.printf("일원 동전 : %d개\n", g);
	}

}
