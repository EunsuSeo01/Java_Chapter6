/**
 * 메소드의 유효성 검사 예제.
 * @author user EunSu Seo
 * last modified 2021-07-25
 */
public class MethodValidTest {
	public static void main(String[] args) {
		method test = new method();
		float result = test.divide(3, 0);
		System.out.println(result);
	}
}
class method {
	float divide (int x, int y) {
		return x / (float)y;
	}
}