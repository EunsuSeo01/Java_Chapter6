/**
 * 메서드의 호출 예제.
 * @author user EunSu Seo
 * last modified 2021-07-25
 */
public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);		// L = long 타입 리터럴이니까.
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}

class MyMath {
	long add (long a, long b) { return a + b; }
	long substract (long a, long b) { return a - b; }
	long multiply (long a, long b) { return a * b; }
	double divide (double a, double b) { return a / b; }
}