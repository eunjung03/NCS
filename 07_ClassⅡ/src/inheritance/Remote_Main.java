package inheritance;

import java.util.Scanner;

class Volume {
	
	// 멤버변수
	int vol = 1;
	
	public void setVolume(int vol) {
		this.vol = vol;
	}
	
	public int getVol() {
		return vol;
	}
	
	// 볼륨을 올리는 메서드
	void volume_up() {
		if(vol > 15) {
			vol = 15;
		}
	}
	
	// 볼륨을 내리는 메서드
	void volume_down() {
		vol--;
		if(vol < 1) {
			vol = 1;
		}
	}
}

class TV extends Volume {	}				// TV 자식클래스

class Computer extends Volume {		}		// 컴퓨터 자식클래스

class Radio extends Volume {	}			// 라디오 자식클래스


public class Remote_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		TV tv = new TV();
		Radio radio = new Radio();
		Computer computer = new Computer();
		
		int menu, volume;
		
		while(true) {
			System.out.print("1. TV / 2. Radio / 3. Computer / 4. 종료 >>> ");
			menu = sc.nextInt();
			
			if(menu == 4) {
				break;		// while문 탈출
			}
			
			System.out.printf("1. 볼륨 Up / 2. 볼륨 Down >>> ");
			volume = sc.nextInt();
			
			switch(menu) {
				case 1 : // TV를 선택한 경우
					if(volume == 1) {			// 볼륨Up을 선택했는지 여부
						tv.volume_up();			// 볼륨 증가 메서드 호출
					}else if(volume == 2) {
						tv.volume_down(); 		// 볼륨 감소 메서드 호출
					}
					break;
				case 2 : // Radio를 선택한 경우
					if(volume == 1) {			// 볼륨Up을 선택했는지 여부
						radio.volume_up();			// 볼륨 증가 메서드 호출
					}else if(volume == 2) {
						radio.volume_down(); 		// 볼륨 감소 메서드 호출
					}
					break;
				case 3 : // Computer를 선택한 경우
					if(volume == 1) {			// 볼륨Up을 선택했는지 여부
						computer.volume_up();			// 볼륨 증가 메서드 호출
					}else if(volume == 2) {
						computer.volume_down(); 		// 볼륨 감소 메서드 호출
					}
					break;
			}	// switch~case문 end
			
			System.out.println();
			System.out.println("==========================================");
			System.out.println("TV : "+tv.getVol()+" / Radio : "+radio.getVol()+
					" / Computer : "+computer.getVol());
			
		}	// while 반복문 end
		
		System.out.println();
		System.out.println("수고 하셨습니다.~~~");
		
		sc.close();
	}

}
