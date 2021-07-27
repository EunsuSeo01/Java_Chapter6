/**
 * Call stack(호출스택) 영역에서의 메서드 호출순서를 알 수 있는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-27
 */
public class CallStackTest2 {
	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음.");
	}
	
	static void firstMethod() {
		System.out.println("firstMethod()이 시작되었음.");
		secondMethod();
		System.out.println("firstMethod()이 끝났음.");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이 시작되었음.");
		System.out.println("secondMethod()이 끝났음.");
	}
}
