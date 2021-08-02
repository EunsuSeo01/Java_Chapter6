/**
 * 생성자 this()를 사용하여 생성자 안에서 (같은 클래스 내의)다른 생성자를 호출하는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-02
 */
class Car2 {	// Car2클래스.
	String color;		// 색상.
	String gearType;	// 변속기 종류 - auto(자동), manual(수동).
	int door;			// 문의 개수.
	
	Car2() {
		this("white", "auto", 4);	// Car(String color, String gearType, int door) 생성자를 호출하는 것.
		// 생성자 간의 호출에는 생성자의 이름 대신 this를 사용해야 함!!
	}
	Car2(String color) {
		this(color, "auto", 4);		// Car(String color, String gearType, int door) 생성자를 호출하는 것.
	}
	Car2(String color, String gearType, int door) {
		this.color = color;		// 인스턴스 자신을 가리키는 참조변수 this를 이용. this.이 붙은 것은 인스턴스 변수를 나타냄.
		this.gearType = gearType;	// 인스턴스변수 = 지역변수;
		this.door = door;
	}
}
public class CarTest2 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	}
}
