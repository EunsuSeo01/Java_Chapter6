/**
 * 클래스 메서드와 인스턴스 메서드의 차이를 알아보기 위한 예제.
 * @author user EunSu Seo
 * last modified 2021-08-01
 */
class MyMath2 {
	long a, b;
	
	// 인스턴스 변수 a, b만을 이용해서 작업하므로 아래의 메서드들에는 매개변수가 필요없다.
	long add() { return a + b; }
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }
	
	// 인스턴스 변수와 관계없이(-> 클래스 메서드로!) 매개변수만으로 작업이 가능하다.
	static long add(long a, long b) { return a + b; }
	static long subtract(long a, long b) { return a - b; }
	static long multiply(long a, long b) { return a * b; }
	static double divide(double a, double b) { return a / b; }
}
public class MyMathTest2 {
	public static void main(String[] args) {
		// 클래스 메서드 호출. 인스턴스 생성 없이 호출 가능.
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));	// double 타입 매개변수를 넣어줌.
		
		MyMath2 mm = new MyMath2();		// 인스턴스 생성.
		mm.a = 200L;
		mm.b = 100L;
		
		// 인스턴스 메서드는 객체 생성 이후에만 호출 가능!!
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
	
}