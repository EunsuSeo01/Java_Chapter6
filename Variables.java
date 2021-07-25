/**
 * p.246 3.1 선언위치에 따른 변수의 종류 부분. '변수는 클래스 변수, 인스턴스 변수, 지역 변수로 모두 세 종류가 있다.'
 * @author user EunSu Seo
 * last modified 2021-07-25
 */
public class Variables {
	// 클래스 영역.
	int iv;	// 인스턴스 변수.
	static int cv;	// 클래스 변수. (static변수, 공유변수)
	
	void method()	// 메서드 영역.
	{
		int lv = 0;	// 지역변수.
	}
}
