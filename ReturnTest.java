/**
 * 반환값이 있는 메서드를 반환값이 없는 메서드로 변경이 가능한 상황을 보여주는 예제.
 * @author user EunSu Seo
 * last modified 2021-07-27
 */
public class ReturnTest {
	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();
		
		// 첫 번째 메서드를 사용.
		int result = r.add(3, 5);
		System.out.println(result);
		
		// 두 번째 메서드를 사용.
		int[] result2 = { 0 };	// 배열을 생성하고 result2[0]의 값을 0으로 초기화.
		r.add(3, 5, result2);	// 배열을 add메서드의 매개변수로 전달.
		System.out.println(result2[0]);
	}
	
	// 합 메서드.
	int add(int a, int b) {
		return a + b;
	}
	// 합 메서드 + 결과를 배열에 저장해 주는 메서드.
	void add(int a, int b, int[] result) {
		result[0] = a + b;	// 매개변수로 넘겨받은 배열에 연산결과를 저장.
	}
}
