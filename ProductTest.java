/**
 * Product 클래스를 다루는 예제.
 * @author user EunSu Seo
 * last modified 2021-08-04
 */
class Product {
	static int count = 0;	// 생성된 인스턴스의 수를 저장하기 위한 변수.	-> 인스턴스끼리 공유되는 값이므로 클래스 변수로 선언.
	int serialNo;			// 인스턴스 고유의 번호.
	
	// 인스턴스 초기화 블럭. -> 인스턴스가 생성될 때마다 실행. 이때마다 하고 싶은 초기화 작업이 있으면 여기에 쓰자.
	{
		++count;	// 인스턴스 갯수 증가.
		serialNo = count;
	}
	
	public Product() { }	// 기본 생성자. 이거 하나니까 생략 가능함.
}
public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
	}
}
