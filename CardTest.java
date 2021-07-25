/**
 * 클래스 변수와 인스턴스 변수의 특성과 차이점을 알 수 있는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-25
 */
class Card {
	String kind;	// 카드 무늬.
	int number;		// 카드 숫자.
	static int width = 100;		// 카드의 폭. -> 모든 카드가 공통적으로 같은 값을 가짐.
	static int height = 250;	// 카드의 높이. -> 모든 카드가 공통적으로 같은 값을 가짐.
}
public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);	// 클래스 변수: 객체 생성 없이도 '클래스이름.클래스변수'로 직접 사용 가능.
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";	// 인스턴스 변수: 클래스의 인스턴스를 생성할 때 만들어진다.
		c1.number = 7;		// 인스턴스마다 가지는 고유한 특징. -> 인스턴스 변수값 변경 -> 해당 인스턴스에게만 영향O.
		
		Card c2 = new Card();
		c2.kind = "Space";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;		// c1과 c2는 클래스 변수인 width와 height를 공유하고 있는 것.
		c1.height = 80; 	// -> c1의 width와 height를 변경하면 c2의 width와 height도 바뀐 것과 같은 결과. -> 모든 인스턴스에게 영향O.
		// c1.width == c2.width == Card.width : 모두 같은 저장공간을 참조하므로 항상 같은 값을 가짐.
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
	}
}
