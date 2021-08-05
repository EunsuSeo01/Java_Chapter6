/**
 * 연습문제 6-24 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-05
 */
public class Exercise6_24 {
	// 주어진 값의 절대값을 반환한다.
	public static int abs(int value) {
		if (value < 0)
			return -value;
		else return value;
		/* 삼항연산자로 더 간단하게 처리 가능!
		return (value < 0) ? -value : value;
		(조건식) ? 참일 때 : 거짓일 때; 형식! 
		*/
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값: " + abs(value));
		value = -10;
		System.out.println(value + "의 절대값: " + abs(value));
	}
}
