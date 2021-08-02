/**
 * 클래스 초기화 블럭 사용 예제.
 * @author user EunSu Seo
 * last modified 2021-08-02
 */
public class StaticBlockTest {
	static int[] arr = new int[10];		// 명시적 초기화를 통해 배열 arr을 생성.
	
	// 클래스 초기화 블럭. -> 복잡한 초기화 작업을 위해 사용.
	static {
		for (int i = 0; i < arr.length; i++) {
			// 1과 10 사이의 랜덤값을 배열 arr에 저장.
			arr[i] = (int) (Math.random() * 10) + 1;
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {	// arr는 클래스 변수.
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}
