/**
 * 매개변수를 가변인자로 선언한 메서드 예제.
 * @author user EunSu Seo
 * last modified 2021-08-02
 */
public class VarArgsEx {
	public static void main(String[] args) {
		String[] strArr = { "100", "200", "300" };	// 문자열 배열.
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
		System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");
	}
	
	static String concatenate(String delim, String... args) {
		String result = "";
		
		// 가변인자 args는 내부적으로 배열을 이용하는 것이기 때문에 향상된 for문 :의 왼쪽에 위치할 수 있다.
		for(String str : args) {
			result += str + delim;	// 문자열은 단순히 +연산자만으로 연결될(이어질) 수 있다.
		}
		
		return result;
	}
}
