/**
 * 매개변수를 참조형으로 선언한 예제. -> 매개변수로 x의 값을 읽는 것과 변경하는 것을 모두 할 수 있음.
 * @author user EunSu Seo
 * last modified 2021-07-27
 */
public class ReferenceParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}