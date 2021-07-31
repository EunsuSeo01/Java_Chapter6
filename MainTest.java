/**
 * main메서드도 재귀호출이 가능. 조건식을 안 써 주어서 종료될 수 없기에 StackOverflowError가 발생하는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-31
 */
public class MainTest {
	public static void main(String[] args) {
		main(null);		// 재귀호출. 자기자신을 다시 호출한다. -> main메서드 역시도 가능!
						// '아무 조건도 없이' 계속 자기자신을 호출하니까 '무한호출'에 빠지게 됨.
						// main 메서드가 종료되지 않고 호출스택에 계속해서 쌓이게 되므로 호출스택의 '메모리 한계'를 넘게 됨.
						// 'StackOverflowError'가 발생하여 프로그램이 비정상적으로 종료됨.
	}
}
