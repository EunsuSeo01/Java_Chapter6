/**
 * 메서드의 매개변수를 배열로 선언한 경우의 예제. -> 배열도 참조형. 배열의 시작주소를 받아서 배열 요소에 접근 가능.
 * @author user EunSu Seo
 * last modified 2021-07-27
 */
public class ReferenceParamEx2 {
	public static void main(String[] args) {
		int[] x = { 10 };	// 크기가 1인 배열. x[0] = 10;
		System.out.println("main() : x = " + x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = " + x[0]);
	}
	
	static void change(int[] x) {	// 참조형 매개변수.
		x[0] = 1000;
		System.out.println("change() : x = " + x[0]);
	}
}
