/**
 * 연습문제 6-	1, 6-2 풀이.
 * @author user EunSu Seo
 * last modified 2021-08-04
 */
public class Exercise6_2 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		// num = 1;
		// isKwang = true;
		this(1, true);		// 이렇게 더 간단하게 할 수 있음.
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		// 삼항연산자로 처리하기> 조건문 ? 참일 때 : 거짓일 때;
		// return num + ((isKwang) ? "K" : "");
		if(this.isKwang)
			return this.num + "K";
		return this.num + "";
		// 변수 num은 int이지만 문자열과 덧셈연산을 하기 때문에 최종적으로는 문자열을 반환하게 된다.
	}
}
