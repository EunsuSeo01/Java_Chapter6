/**
 * 매개변수의 유효성 검사를 추가해 더욱 견고하게 만든 factorial 메서드 예제.
 * @author user EunSu Seo
 * last modified 2021-07-31
 */
public class FactorialTest2 {
	static long factorial (int n) {		// 반환타입을 int보다 최댓값이 더 큰 long으로 설정.
		// 매개변수의 유효성 검사**
		if (n <= 0 || n > 20) return -1;	// 이 경우일 때는 -1 반환 후 바로 메서드 종료.
		if (n <= 1) return 1;	// 어차피 위의 경우에 포함 안 된 케이스만 이 문장을 만날 수 있음.
		return n * factorial(n-1);	// 이 문장도 마찬가지.
	}
	public static void main(String[] args) {
		int n = 21;
		long result = 0;
		
		for (int i = 1; i <= n; i++) {
			result = factorial(i);	// 재귀 메서드 안에서 재귀 호출이 다 끝나고 최종 반환된 값이 result에 들어감.
			
			if (result == -1) {
				System.out.printf("유효하지 않은 값입니다. (0 < n <= 20) : %d%n", n);
				break;	// result값 하나라도 -1이 나오면 반복문 탈출.
			}
			
			System.out.printf("%2d! = %20d%n", i, result);
		}
	}

}
