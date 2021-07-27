/**
 * Call stack(호출스택) 영역의 변화를 알아보기 위한 예제.
 * @author user EunSu Seo
 * last modified 2021-07-27
 */
public class CallStackTest {
	public static void main(String[] args) {
		firstMethod();	// static 메서드는 객체 생성없이도 호출이 가능.
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
