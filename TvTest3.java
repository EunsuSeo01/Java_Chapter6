/**
 * 두 개의 참조변수가 하나의 인스턴스를 참조하게 되는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-25
 */
public class TvTest3 {
	public static void main(String[] args) {
		Tv t1 = new Tv();	// Tv클래스 타입의 참조변수 t1에 (연산자 new에 의해 생성된)Tv인스턴스의 주소값을 저장함.
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1;	// Tv클래스 타입의 참조변수 t2에 t1의 값(= Tv인스턴스의 주소값)을 저장함.
		t1.channel = 7;	// channel값을 7로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}
}
