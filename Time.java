/**
 * 데이터에 대한 추가적인 제약조건을 잘 반영할 수 있는 객체지향언어의 특성을 알 수 있는 예제. -> 제어자와 메서드를 이용함으로써.
 * @author user EunSu Seo
 * last modified 2021-07-25
 */
public class Time {
	/* 하나의 시간을 구성하는 시, 분, 초가 서로 분리되어 있으면
	 -> 프로그램 수행과정에서 시, 분, 초가 따로 뒤섞여서 올바르지 않은 데이터가 될 가능성이 있음.
	   시, 분, 초를 '하나로 묶는 사용자정의 타입', 즉 '클래스'를 정의하여 사용해야 한다. */
	private int hour;
	private int minute;
	private float second;
	
	public int getHour() { return hour; }
	public int getMinute() { return minute; }
	public float getSecond() { return second; }
	
	public void setHour(int h) {
		if (h < 0 || h > 23) return;
		hour = h;
	}
	
	public void setMinute(int m) {
		if (m < 0 || m > 59) return;
		minute = m;
	}
	
	public void setSecond(int s) {
		if (s < 0.0f || s > 59.99f) return;
		second = s;
	}
}
