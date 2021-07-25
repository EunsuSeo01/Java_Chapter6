/**
 * 객체 배열(= 참조변수들을 하나로 묶은, 참조변수 배열)을 정의하고 생성하는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-25
 */
public class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];	// 길이가 3인 객체 배열. 객체의 주소가 저장될 공간이 3개 마련.
		
		// Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장.
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;	// tvArr[i]의 channel에 i + 10을 저장.
		}
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();	// tvArr[i]의 메서드를 호출. channel값이 1 증가.
			System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);
		}
		
	}
}
