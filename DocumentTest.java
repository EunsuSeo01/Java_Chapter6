/**
 * Document 클래스를 이용하여 문서를 다루는 프로그램.
 * @author user EunSu Seo
 * last modified 2021-08-04
 */
class Document {
	static int count = 0;	// 클래스 변수.
	String name;			// 인스턴스 변수.
	
	Document() {	// 매개변수가 없는 생성자. -> 문서를 생성할 때 문서명을 지정하지 않았을 때.
		this("제목없음" + ++count);
	}
	
	Document(String name) {	// 매개변수가 있는 생성자. -> 문서명을 지정했을 때.
		this.name = name;	// 인스턴스 변수 = 지역변수;
		System.out.println("문서 " + this.name + "가 생성되었습니다.");
	}
}
public class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}
	
}
