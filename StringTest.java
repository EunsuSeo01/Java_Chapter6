/**
 * 연습문제 6-19 풀이 중 깨닫게 된 String은 불변 객체라는 사실...을 테스트 해 보기 위한 코드.
 * @author user EunSu Seo
 * last modified 2021-08-04
 */
public class StringTest {
	public static void main(String[] args) {
		String a = new String("Hello");
		String b = a;	// 이때까지만 해도 같은 공간을 가리키고 있는 참조변수 둘이었는데
		a += ".";		// a에 "."가 추가되면서 a는 새로운 객체를 생성하게 되어서 b와는(아까와는) 다른 공간을 가리키게 된다...
		String c = "Hell";
		c += "o";
		
		System.out.println(a == b);
		System.out.println(a == c);		// 진짜 충격... c에 "o"가 추가되는 연산은 원래 있던 "Hell"에 이어붙여져서 "Hello"
										// 가 되는 건 줄 알았는데 아니었다. 새롭게 객체를 생성하는 것이었다. "Hello"라는 객체를...
										// *** String은 불변 객체이기 때문이다.
	}
}
