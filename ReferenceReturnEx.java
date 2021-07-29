/**
 * 메서드의 반환타입이 참조형인 경우의 예제.
 * @author user EunSu Seo
 * last modified 2021-07-29
 */
public class ReferenceReturnEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		Data d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp;
	}
}
