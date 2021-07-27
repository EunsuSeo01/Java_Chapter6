/**
 * 매개변수를 기본형으로 선언한 예제. -> 매개변수로 x의 값을 변경할 수 없음. 원본에 영향을 미치지 못함.
 * @author user EunSu Seo
 * last modified 2021-07-27
 */
public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
class Data {
	int x;
}