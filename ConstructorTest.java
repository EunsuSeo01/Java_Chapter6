/**
 * 기본 생성자가 추가되는 경우를 알려 주는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-02
 */
// 생성자가 하나도 없는 Data1 클래스. -> 컴파일러가 기본 생성자를 추가해 줌.
class Data1 {
	int value;
}
// 생성자가 하나 있는 Data2 클래스. -> 컴파일러가 기본 생성자를 만들어 주지 않음.
class Data2 {
	int value;
	
	Data2(int x) {	// 매개변수가 하나 있는 생성자를 선언한 것.
		value = x;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();		// Data1 클래스에는 Data1() 생성자(= 기본 생성자)가 있어서 그게 잘 실행됨.
		// Data2 d2 = new Data2();	// ERROR! 컴파일 에러 발생. Data2 클래스에는 Data2() 생성자가 없음.
		// *** 기본 생성자가 컴파일러에 의해서 자동으로 추가되는 경우는 '해당 클래스에 정의된 생성자가 하나도 없을 때' 뿐이다.
		Data2 d2 = new Data2(10);	// OK.
	}
}
