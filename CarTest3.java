/**
 * 
 * @author user EunSu Seo
 * last modified 2021-08-02
 */
class Car3 {
	String color;
	String gearType;
	int door;
	
	// 생성자 선언.
	Car3() {
		this("white", "auto", 4);	// 같은 클래스의 다른 생성자를 호출 -> '첫 줄에서' this()를 사용한다.
	}
	
	Car3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	// 인스턴스의 복사를 위한 생성자.
	Car3(Car3 c) {	// 참조변수 c가 가리키고 있는 인스턴스의 상태(변수)를 복사해 온다.
		// color = c.color;
		// gearType = c.gearType;
		// door = c.door;
		this(c.color, c.gearType, c.door);	// 위의 세 줄보다 이렇게 같은 클래스의 다른 생성자를 호출하여 처리하는 게 더 좋다.
		// 생성자 this()를 '첫 줄에서' 사용한다!
	}
	
}
public class CarTest3 {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);	// 인스턴스의 복사를 위한 생성자가 호출됨. (매개변수에 참조변수 c1이 들어갔기 때문) : c1의 복사본인 c2가 생성.
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
		
		c1.door = 100;	// c1의 인스턴스 변수 door의 값을 변경.
		System.out.println("c1.door = 100; 수행 후");		// c1, c2는 서로 독립적인 메모리 공간에 존재하는 별도의 인스턴스임!
														// 그래서 c1의 door값만 바뀐다.
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
	}
}
