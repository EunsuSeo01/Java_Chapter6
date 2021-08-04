/**
 * 초기화 순서를 살펴보기 위한 간단 test 예제.
 * @author user EunSu Seo
 * last modified 2021-08-04
 */
public class InitTest {
	static int cv = 1;
	int iv = 1;
	
	// 클래스 초기화 블럭.
	static {
		cv = 2;
		// iv = 5;		ERROR! -> 클래스 관련 부분에서 인스턴스 변수 접근 불가.
	}
	
	// 인스턴스 초기화 블럭.
	{
		cv = 5;
		iv = 2;		// 인스턴스 관련 부분에서 클래스 변수 접근은 당연히 가능.
	}
	
	// 생성자.
	InitTest() {
		iv = 3;
	}
}
