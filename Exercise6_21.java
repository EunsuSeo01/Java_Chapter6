/**
 * 연습문제 6-21 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-04
 */
class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	// TV를 켜는 메서드.
	void turnOnOff() {
		// isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
		// if (isPowerOn) isPowerOn = false;
		// else isPowerOn = true;
		isPowerOn = !isPowerOn;		// 이렇게 더 간단하게 가능.
	}
	
	void volumeUp() {
		// volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
		if (volume < MAX_VOLUME)
			volume++;
	}
	
	void volumeDown() {
		// volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
		if (volume > MIN_VOLUME)
			volume--;
	}
	
	// TV 채널 바꾸는 메서드.
	void channelUp() {
		channel++;
		if (channel == MAX_CHANNEL + 1)
			channel = MIN_CHANNEL;
	}
	
	void channelDown() {
		channel--;
		if (channel == MIN_CHANNEL - 1)
			channel = MAX_CHANNEL;
	}
}

public class Exercise6_21 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
	}
}
