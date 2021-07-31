/**
 * x^1부터 x^n까지의 합을 구하는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-31
 */
public class PowerTest {
	public static void main(String[] args) {
		int x = 2;	// 밑은 2로.
		int n = 5;	// 제곱은 5제곱까지.
		long result = 0;
		
		// for 반복문을 통해 x^1제곱부터 x^n제곱까지의 합을 계산함.
		for (int i = 1; i <= n; i++) {
			result += power(x, i);
		}
		
		System.out.println(result);
	}
	
	// n 제곱의 값을 구하는 것을 재귀적으로 구현.
	// 반환타입이 long, 그래서 이 반환값을 받는 result 변수도 long 타입.
	static long power(int x, int n) {
		if (n == 1) return x;
		return x * power(x, n-1);	// 2^3 = 2 * 2^2
	}
	
}
