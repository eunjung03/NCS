package interfaces;

interface RemoteControl {
	
	int max_volum = 10;
	int min_volum = 1;
	
	// 추상메서드
	void turnOn();
	void turnOff();
	void setVolum(int volume);
	
}

class Audio implements RemoteControl {
	
	int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 전원을 끕니다.");
	}

	@Override
	public void setVolum(int volume) {
		if(volume > RemoteControl.max_volum) {
			this.volume = RemoteControl.max_volum;
		}else if(volume < RemoteControl.min_volum) {
			this.volume = RemoteControl.min_volum;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 >>> "+this.volume);
	}
}

// 컴퓨터 객체 Volume 설정
class Computer implements RemoteControl {
	int volume;

	@Override
	public void turnOn() {
		System.out.println("Computer 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Computer 전원을 끕니다.");
	}

	@Override
	public void setVolum(int volume) {
		if(volume > RemoteControl.max_volum) {
			this.volume = RemoteControl.max_volum;
		}else if(volume < RemoteControl.min_volum) {
			this.volume = RemoteControl.min_volum;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Computer 볼륨 >>> "+this.volume);
	}
	
}

// TV 객체 Volume 설정
class Tv implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 끕니다.");
	}

	@Override
	public void setVolum(int volume) {
		if(volume > RemoteControl.max_volum) {
			this.volume = RemoteControl.max_volum;
		}else if(volume < RemoteControl.min_volum) {
			this.volume = RemoteControl.min_volum;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 >>> "+this.volume);
	}
}

public class Remote_Main {

	public static void main(String[] args) {

		// Audio
		Audio audio = new Audio();
		audio.turnOn();
		audio.setVolum(3);
		audio.turnOff();
		System.out.println();
		
		// Computer
		Computer computer = new Computer();
		computer.turnOn();
		computer.setVolum(16);
		computer.turnOff();
		System.out.println();
		
		// TV
		Tv tv = new Tv();
		tv.turnOn();
		tv.setVolum(0);
		tv.turnOff();
		
	}

}
