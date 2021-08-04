/**
 * 연습문제 6-19 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-04
 */
public class Exercise6_19 {
	public static void change(String str) {
		str += "456";	// 이 지역변수 str에 들어간 주소값은 main메서드 안의 str의 주소값과는 다르다. -> 새 공간의 주소값.
						// 값을 변경할 수 없으니까 아예 새 공간을 만들어서 거기에 "ABC123456"을 저장해버린 것임.
	}
	public static void main(String[] args) {
		String str = new String("ABC123");
		System.out.println(str);
		change(str);
		System.out.println("After change: " + str);		// 그래서 원래 위치에 있는 값을 출력하려고 하니까 변하지 않은 값이 나옴.
	}
}
