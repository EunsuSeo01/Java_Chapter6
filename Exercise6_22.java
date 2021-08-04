/**
 * 연습문제 6-22 풀이. -> 다시 해야 됨.
 * @author user EunSu Seo
 * last modified 2021-08-04
 */
public class Exercise6_22 {
	static boolean isNumber(String str) {
		boolean result = true;
		for (int i = 0; i < str.length(); i++) {
			char check = str.charAt(i);
			if (Character.isLetter(check))	// null이랑 빈문자열 일 때는 안 됨. 다른 방법을 생각해 봐야 함.
				result = false;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234ㅇ";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
}
