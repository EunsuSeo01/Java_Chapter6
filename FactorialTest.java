/**
 * 재귀호출(Recursive call)의 대표적인 예, 팩토리얼을 구하는 재귀 메서드를 구현한 예제.
 * @author user EunSu Seo
 * last modified 2021-07-29
 */
public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}

	static int factorial(int n) {
		int result = 0;
		
		if (n == 1)
			return 1;
		else if (n > 1)
			result = n * factorial(n - 1);	// 재귀호출.
		
		return result;
	}
}
