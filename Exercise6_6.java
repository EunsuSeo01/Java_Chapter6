/**
 * 연습문제 6-6 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-04
 */
public class Exercise6_6 {
	// 두 점 (x, y)와 (x1, y1)간의 거리를 구한다.
	// 클래스 메서드.
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt(Math.pow(x-x1, 2) + Math.pow(y-y1, 2));
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}
}
