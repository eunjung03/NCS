package interfaces;

interface Camera {
	
	// 사진을 찍는 기능
	void photo();
}

interface DMB {
	
	// TV를 보는 기능
	void viewTv();
	
}

interface MP3 {
	
	// 음악을 듣는 기능
	void playMP3();
}

public class MyPhone implements Camera, DMB, MP3 {

	@Override
	public void playMP3() {
		
	}

	@Override
	public void viewTv() {
		
	}

	@Override
	public void photo() {

	}

}
