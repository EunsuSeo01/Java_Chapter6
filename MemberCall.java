/**
 * 클래스 멤버(클래스 변수 + 클래스 메서드)와 인스턴스 멤버의 차이를 알 수 있는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-01
 */
public class MemberCall {
	int iv = 10;	// 인스턴스 변수.
	static int cv = 20;		// 클래스 변수.
	
	int iv2 = cv;	// 인스턴스 변수는 클래스 변수 사용 가능.
	// static int cv2 = iv;		// 에러. 클래스 변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2 = new MemberCall().iv;	// 이렇게 객체를 생성해야 사용 가능.
	
	// 클래스 메서드 정의.
	static void staticMethod1() {
		System.out.println(cv);
		// System.out.println(iv);		// 에러. 클래스 메서드에서 인스턴스 변수 사용 불가.
		MemberCall c = new MemberCall();	// 객체 생성.
		System.out.println(c.iv);	// 객체 생성 이후에는 인스턴스 변수 참조 가능.
	}
	
	// 인스턴스 메서드 정의.
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);		// 인스턴스 메서드에서는 인스턴스 변수를 바로 사용가능.
	}
	
	static void staticMethod2() {
		staticMethod1();
		// instanceMethod1();	// 에러. 클래스 메서드에서는 인스턴스 메서드를 호출할 수 없음.
		MemberCall c = new MemberCall();
		c.instanceMethod1();	// 인스턴스 생성 이후에야 호출 가능.
	}
	
	void instanceMethod2() {	// 인스턴스 메서드에서는
		staticMethod1();		// 클래스 메서드와
		instanceMethod1();		// 인스턴스 메서드 모두 인스턴스 생성없이 바로 호출이 가능하다.
	}
}
