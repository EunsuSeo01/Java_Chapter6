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
		num = 1;
		isKwang = true;
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		if(this.isKwang)
			return this.num + "K";
		return this.num + "";
	}
}
