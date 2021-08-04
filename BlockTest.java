/**
 * 클래스 초기화 블럭과 인스턴스 초기화 블럭, main 메서드, 생성자의 실행 순서를 알아볼 수 있는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-02
 */
public class BlockTest {
	// 클래스 초기화 블럭. -> 클래스가 메모리에 처음 로딩될 때 한번만 수행됨.
	static {
		System.out.println("클래스 초기화 블럭. static { }");
	}
	
	// 인스턴스 초기화 블럭. -> 인스턴스가 생성될 때마다 수행됨.
	{
		System.out.println("인스턴스 초기화 블럭. { }");
	}
	
	// 생성자.
	BlockTest() {
		System.out.println("생성자.");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();		// 인스턴스 생성. -> 인스턴스 초기화 블럭이 먼저 수행되고, 생성자가 그 다음에 수행됨!
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();	// 인스턴스 생성.
	}
}
