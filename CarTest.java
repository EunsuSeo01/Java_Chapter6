/**
 * 매개변수가 있는 생성자를 사용하면, 인스턴스를 생성하는 동시에 초기화할 수 있다는 것을 보여주는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-02
 */
class Car {
	String color;		// 차의 색상.
	String gearType;	// 변속기 종류 - auto(자동), manual(수동).
	int door;			// 문의 개수.
	
	Car() { };	// 매개변수가 없는 생성자.
	Car(String c, String g, int d) {	// 매개변수가 3개인 생성자.
		color = c;
		gearType = g;
		door = d;		// 인스턴스 변수 초기화!
	}
}
public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();		// 매개변수가 없는 생성자를 호출.
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white", "auto", 4);	// 매개변수가 3개인 생성자를 호출.
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	}
}
